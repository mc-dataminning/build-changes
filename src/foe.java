import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public interface foe {
   static foe.a a(elk $$0) {
      return a(ImmutableMap.of(), $$0);
   }

   static foe.a a(Map<fom, elk> $$0, elk $$1) {
      return new foe.a($$1, $$0);
   }

   elt getBuffer(fom var1);

   public static class a implements foe {
      protected final elk a;
      protected final Map<fom, elk> b;
      protected Optional<fom> c = Optional.empty();
      protected final Set<elk> d = Sets.newHashSet();

      protected a(elk $$0, Map<fom, elk> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public elt getBuffer(fom $$0) {
         Optional<fom> $$1 = $$0.O();
         elk $$2 = this.b($$0);
         if (!Objects.equals(this.c, $$1) || !$$0.N()) {
            if (this.c.isPresent()) {
               fom $$3 = this.c.get();
               if (!this.b.containsKey($$3)) {
                  this.a($$3);
               }
            }

            if (this.d.add($$2)) {
               $$2.a($$0.J(), $$0.I());
            }

            this.c = $$1;
         }

         return $$2;
      }

      private elk b(fom $$0) {
         return this.b.getOrDefault($$0, this.a);
      }

      public void a() {
         if (this.c.isPresent()) {
            fom $$0 = this.c.get();
            if (!this.b.containsKey($$0)) {
               this.a($$0);
            }

            this.c = Optional.empty();
         }
      }

      public void b() {
         this.c.ifPresent($$0x -> {
            elt $$1 = this.getBuffer($$0x);
            if ($$1 == this.a) {
               this.a($$0x);
            }
         });

         for (fom $$0 : this.b.keySet()) {
            this.a($$0);
         }
      }

      public void a(fom $$0) {
         elk $$1 = this.b($$0);
         boolean $$2 = Objects.equals(this.c, $$0.O());
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
