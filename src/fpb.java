import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public interface fpb {
   static fpb.a a(emc $$0) {
      return a(ImmutableMap.of(), $$0);
   }

   static fpb.a a(Map<fpj, emc> $$0, emc $$1) {
      return new fpb.a($$1, $$0);
   }

   eml getBuffer(fpj var1);

   public static class a implements fpb {
      protected final emc a;
      protected final Map<fpj, emc> b;
      protected Optional<fpj> c = Optional.empty();
      protected final Set<emc> d = Sets.newHashSet();

      protected a(emc $$0, Map<fpj, emc> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public eml getBuffer(fpj $$0) {
         Optional<fpj> $$1 = $$0.O();
         emc $$2 = this.b($$0);
         if (!Objects.equals(this.c, $$1) || !$$0.N()) {
            if (this.c.isPresent()) {
               fpj $$3 = this.c.get();
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

      private emc b(fpj $$0) {
         return this.b.getOrDefault($$0, this.a);
      }

      public void a() {
         if (this.c.isPresent()) {
            fpj $$0 = this.c.get();
            if (!this.b.containsKey($$0)) {
               this.a($$0);
            }

            this.c = Optional.empty();
         }
      }

      public void b() {
         this.c.ifPresent($$0x -> {
            eml $$1 = this.getBuffer($$0x);
            if ($$1 == this.a) {
               this.a($$0x);
            }
         });

         for (fpj $$0 : this.b.keySet()) {
            this.a($$0);
         }
      }

      public void a(fpj $$0) {
         emc $$1 = this.b($$0);
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
