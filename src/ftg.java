import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public interface ftg {
   static ftg.a a(epv $$0) {
      return a(ImmutableMap.of(), $$0);
   }

   static ftg.a a(Map<fto, epv> $$0, epv $$1) {
      return new ftg.a($$1, $$0);
   }

   eqe getBuffer(fto var1);

   public static class a implements ftg {
      protected final epv a;
      protected final Map<fto, epv> b;
      protected Optional<fto> c = Optional.empty();
      protected final Set<epv> d = Sets.newHashSet();

      protected a(epv $$0, Map<fto, epv> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public eqe getBuffer(fto $$0) {
         Optional<fto> $$1 = $$0.N();
         epv $$2 = this.b($$0);
         if (!Objects.equals(this.c, $$1) || !$$0.M()) {
            if (this.c.isPresent()) {
               fto $$3 = this.c.get();
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

      private epv b(fto $$0) {
         return this.b.getOrDefault($$0, this.a);
      }

      public void a() {
         if (this.c.isPresent()) {
            fto $$0 = this.c.get();
            if (!this.b.containsKey($$0)) {
               this.a($$0);
            }

            this.c = Optional.empty();
         }
      }

      public void b() {
         this.c.ifPresent($$0x -> {
            eqe $$1 = this.getBuffer($$0x);
            if ($$1 == this.a) {
               this.a($$0x);
            }
         });

         for (fto $$0 : this.b.keySet()) {
            this.a($$0);
         }
      }

      public void a(fto $$0) {
         epv $$1 = this.b($$0);
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
