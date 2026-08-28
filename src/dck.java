import com.mojang.serialization.Codec;

public record dck(czd c) {
   public static final Codec<dck> a = czd.b.xmap(dck::new, dck::a);
   public static final yw<wj, dck> b = yw.a(czd.i, dck::a, dck::new);

   public czd a(czd $$0, int $$1, boolean $$2, dck.a $$3) {
      if ($$2) {
         return $$0;
      } else if ($$0.M() >= $$1) {
         return $$0;
      } else {
         czd $$4 = this.c.v();
         if ($$0.f()) {
            return $$4;
         } else {
            $$3.apply($$4);
            return $$0;
         }
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         dck $$1 = (dck)$$0;
         return czd.a(this.c, $$1.c);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return czd.b(this.c);
   }

   public czd a() {
      return this.c;
   }

   @FunctionalInterface
   public interface a {
      void apply(czd var1);
   }
}
