import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public interface ftf {
   static ftf.a a(epu $$0) {
      return a(ImmutableMap.of(), $$0);
   }

   static ftf.a a(Map<ftn, epu> $$0, epu $$1) {
      return new ftf.a($$1, $$0);
   }

   eqd getBuffer(ftn var1);

   public static class a implements ftf {
      protected final epu a;
      protected final Map<ftn, epu> b;
      protected Optional<ftn> c = Optional.empty();
      protected final Set<epu> d = Sets.newHashSet();

      protected a(epu $$0, Map<ftn, epu> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public eqd getBuffer(ftn $$0) {
         Optional<ftn> $$1 = $$0.N();
         epu $$2 = this.b($$0);
         if (!Objects.equals(this.c, $$1) || !$$0.M()) {
            if (this.c.isPresent()) {
               ftn $$3 = this.c.get();
               if (!this.b.containsKey($$3)) {
                  this.a($$3);
               }
            }

            if (this.d.add($$2)) {
               $$2.a($$0.I(), $$0.H());
            }

            this.c = $$1;
         }

         return $$2;
      }

      private epu b(ftn $$0) {
         return this.b.getOrDefault($$0, this.a);
      }

      public void a() {
         if (this.c.isPresent()) {
            ftn $$0 = this.c.get();
            if (!this.b.containsKey($$0)) {
               this.a($$0);
            }

            this.c = Optional.empty();
         }
      }

      public void b() {
         this.c.ifPresent($$0x -> {
            eqd $$1 = this.getBuffer($$0x);
            if ($$1 == this.a) {
               this.a($$0x);
            }
         });

         for (ftn $$0 : this.b.keySet()) {
            this.a($$0);
         }
      }

      public void a(ftn $$0) {
         epu $$1 = this.b($$0);
         boolean $$2 = Objects.equals(this.c, $$0.N());
         if ($$2 || $$1 != this.a) {
            if (this.d.remove($$1)) {
               $$0.a($$1, RenderSystem.getVertexSorting());
               if ($$2) {
                  this.c = Optional.empty();
               }
            }
         }
      }
   }
}
