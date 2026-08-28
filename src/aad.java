import com.google.common.collect.Lists;
import java.util.List;

public record aad(aax c) implements zw<aac> {
   private static final int d = 1048576;
   public static final zn<xa, aad> a = aax.<xa>a(
         $$0 -> aay.a($$0, 1048576),
         ac.a(
            Lists.newArrayList(
               new aax.c[]{
                  new aax.c<>(aav.b, aav.a),
                  new aax.c<>(aat.b, aat.a),
                  new aax.c<>(aau.b, aau.a),
                  new aax.c<>(aaw.b, aaw.a),
                  new aax.c<>(aaz.b, aaz.a),
                  new aax.c<>(aba.b, aba.a),
                  new aax.c<>(abb.b, abb.a),
                  new aax.c<>(abc.b, abc.a),
                  new aax.c<>(abd.b, abd.a),
                  new aax.c<>(abe.b, abe.a),
                  new aax.c<>(abf.b, abf.a),
                  new aax.c<>(abg.b, abg.a),
                  new aax.c<>(abh.b, abh.a),
                  new aax.c<>(abi.b, abi.a),
                  new aax.c<>(abj.b, abj.a),
                  new aax.c<>(abk.b, abk.a),
                  new aax.c<>(abl.b, abl.a),
                  new aax.c<>(abm.b, abm.a),
                  new aax.c<>(abn.b, abn.a)
               }
            ),
            $$0 -> {
            }
         )
      )
      .a(aad::new, aad::b);
   public static final zn<wm, aad> b = aax.<wm>a($$0 -> aay.a($$0, 1048576), List.of(new aax.c<>(aav.b, aav.a))).a(aad::new, aad::b);

   @Override
   public zy<aad> a() {
      return aam.a;
   }

   public void a(aac $$0) {
      $$0.a(this);
   }

   public aax b() {
      return this.c;
   }
}
