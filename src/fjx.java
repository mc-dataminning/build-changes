import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public interface fjx {
   static fjx.a a(eie $$0) {
      return a(ImmutableMap.of(), $$0);
   }

   static fjx.a a(Map<fkf, eie> $$0, eie $$1) {
      return new fjx.a($$1, $$0);
   }

   ein getBuffer(fkf var1);

   public static class a implements fjx {
      protected final eie a;
      protected final Map<fkf, eie> b;
      protected Optional<fkf> c = Optional.empty();
      protected final Set<eie> d = Sets.newHashSet();

      protected a(eie $$0, Map<fkf, eie> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public ein getBuffer(fkf $$0) {
         Optional<fkf> $$1 = $$0.O();
         eie $$2 = this.b($$0);
         if (!Objects.equals(this.c, $$1) || !$$0.N()) {
            if (this.c.isPresent()) {
               fkf $$3 = this.c.get();
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

      private eie b(fkf $$0) {
         return this.b.getOrDefault($$0, this.a);
      }

      public void a() {
         if (this.c.isPresent()) {
            fkf $$0 = this.c.get();
            if (!this.b.containsKey($$0)) {
               this.a($$0);
            }

            this.c = Optional.empty();
         }
      }

      public void b() {
         this.c.ifPresent($$0x -> {
            ein $$1 = this.getBuffer($$0x);
            if ($$1 == this.a) {
               this.a($$0x);
            }
         });

         for (fkf $$0 : this.b.keySet()) {
            this.a($$0);
         }
      }

      public void a(fkf $$0) {
         eie $$1 = this.b($$0);
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
