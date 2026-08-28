import com.mojang.serialization.Codec;

public record dal(cxh c) {
   public static final Codec<dal> a = cxh.b.xmap(dal::new, dal::a);
   public static final yn<wa, dal> b = yn.a(cxh.i, dal::a, dal::new);

   public cxh a(cxh $$0, int $$1, boolean $$2, dal.a $$3) {
      if ($$2) {
         return $$0;
      } else if ($$0.M() >= $$1) {
         return $$0;
      } else {
         cxh $$4 = this.c.v();
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
         dal $$1 = (dal)$$0;
         return cxh.a(this.c, $$1.c);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return cxh.b(this.c);
   }

   public cxh a() {
      return this.c;
   }

   @FunctionalInterface
   public interface a {
      void apply(cxh var1);
   }
}
