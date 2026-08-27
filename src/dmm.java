import com.mojang.serialization.Codec;
import java.util.function.Function;

public record dmm<WC extends dmh>(dmo<WC> d, WC e) {
   public static final Codec<dmm<?>> a = jb.Q.q().dispatch($$0 -> $$0.d, dmo::c);
   public static final Codec<he<dmm<?>>> b = aen.a(jc.ar, a);
   public static final Codec<hi<dmm<?>>> c = ht.a(jc.ar, a);

   public boolean a(aru $$0) {
      return this.d.a(this.e, $$0);
   }

   public boolean a(dmj $$0, dgw $$1, Function<gu, he<cqk>> $$2, aru $$3, djv $$4, cot $$5, dgv $$6) {
      return aa.a($$1.f()) ? false : this.d.a($$0, this.e, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public dmo<WC> a() {
      return this.d;
   }

   public WC b() {
      return this.e;
   }
}
