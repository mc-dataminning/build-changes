import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public interface fsi {
   static fsi.a a(eoy $$0) {
      return a(ImmutableMap.of(), $$0);
   }

   static fsi.a a(Map<fsq, eoy> $$0, eoy $$1) {
      return new fsi.a($$1, $$0);
   }

   eph getBuffer(fsq var1);

   public static class a implements fsi {
      protected final eoy a;
      protected final Map<fsq, eoy> b;
      protected Optional<fsq> c = Optional.empty();
      protected final Set<eoy> d = Sets.newHashSet();

      protected a(eoy $$0, Map<fsq, eoy> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public eph getBuffer(fsq $$0) {
         Optional<fsq> $$1 = $$0.N();
         eoy $$2 = this.b($$0);
         if (!Objects.equals(this.c, $$1) || !$$0.M()) {
            if (this.c.isPresent()) {
               fsq $$3 = this.c.get();
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

      private eoy b(fsq $$0) {
         return this.b.getOrDefault($$0, this.a);
      }

      public void a() {
         if (this.c.isPresent()) {
            fsq $$0 = this.c.get();
            if (!this.b.containsKey($$0)) {
               this.a($$0);
            }

            this.c = Optional.empty();
         }
      }

      public void b() {
         this.c.ifPresent($$0x -> {
            eph $$1 = this.getBuffer($$0x);
            if ($$1 == this.a) {
               this.a($$0x);
            }
         });

         for (fsq $$0 : this.b.keySet()) {
            this.a($$0);
         }
      }

      public void a(fsq $$0) {
         eoy $$1 = this.b($$0);
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
