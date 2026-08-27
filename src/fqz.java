import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public interface fqz {
   static fqz.a a(enw $$0) {
      return a(ImmutableMap.of(), $$0);
   }

   static fqz.a a(Map<frh, enw> $$0, enw $$1) {
      return new fqz.a($$1, $$0);
   }

   eof getBuffer(frh var1);

   public static class a implements fqz {
      protected final enw a;
      protected final Map<frh, enw> b;
      protected Optional<frh> c = Optional.empty();
      protected final Set<enw> d = Sets.newHashSet();

      protected a(enw $$0, Map<frh, enw> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public eof getBuffer(frh $$0) {
         Optional<frh> $$1 = $$0.N();
         enw $$2 = this.b($$0);
         if (!Objects.equals(this.c, $$1) || !$$0.M()) {
            if (this.c.isPresent()) {
               frh $$3 = this.c.get();
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

      private enw b(frh $$0) {
         return this.b.getOrDefault($$0, this.a);
      }

      public void a() {
         if (this.c.isPresent()) {
            frh $$0 = this.c.get();
            if (!this.b.containsKey($$0)) {
               this.a($$0);
            }

            this.c = Optional.empty();
         }
      }

      public void b() {
         this.c.ifPresent($$0x -> {
            eof $$1 = this.getBuffer($$0x);
            if ($$1 == this.a) {
               this.a($$0x);
            }
         });

         for (frh $$0 : this.b.keySet()) {
            this.a($$0);
         }
      }

      public void a(frh $$0) {
         enw $$1 = this.b($$0);
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
