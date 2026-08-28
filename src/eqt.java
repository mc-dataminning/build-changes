import com.mojang.serialization.MapCodec;

public class eqt extends equ {
   public static final eqt a = new eqt(eij.a(0));
   public static final MapCodec<eqt> b = eij.a.fieldOf("value").xmap(eqt::new, eqt::b);
   private final eij d;

   public static eqt a(eij $$0) {
      return new eqt($$0);
   }

   private eqt(eij $$0) {
      this.d = $$0;
   }

   public eij b() {
      return this.d;
   }

   @Override
   public int a(bai $$0, eim $$1) {
      return this.d.a($$1);
   }

   @Override
   public eqv<?> a() {
      return eqv.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
