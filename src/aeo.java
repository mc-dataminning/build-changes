import javax.annotation.Nullable;

public record aeo(int b, jg<bvx> c) implements zj<aby> {
   public static final za<wn, aeo> a = za.a(yy.h, aeo::b, bvx.b, aeo::e, aeo::new);

   @Override
   public zl<aeo> a() {
      return agr.ao;
   }

   public void a(aby $$0) {
      $$0.a(this);
   }

   @Nullable
   public bwv a(djz $$0) {
      return $$0.a(this.b);
   }

   public jg<bvx> e() {
      return this.c;
   }
}
