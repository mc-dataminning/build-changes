import com.google.common.collect.Lists;
import java.util.List;

public record aac(aaw c) implements zv<aab> {
   private static final int d = 1048576;
   public static final zm<wz, aac> a = aaw.<wz>a(
         $$0 -> aax.a($$0, 1048576),
         ac.a(
            Lists.newArrayList(
               new aaw.c[]{
                  new aaw.c<>(aau.b, aau.a),
                  new aaw.c<>(aas.b, aas.a),
                  new aaw.c<>(aat.b, aat.a),
                  new aaw.c<>(aav.b, aav.a),
                  new aaw.c<>(aay.b, aay.a),
                  new aaw.c<>(aaz.b, aaz.a),
                  new aaw.c<>(aba.b, aba.a),
                  new aaw.c<>(abb.b, abb.a),
                  new aaw.c<>(abc.b, abc.a),
                  new aaw.c<>(abd.b, abd.a),
                  new aaw.c<>(abe.b, abe.a),
                  new aaw.c<>(abf.b, abf.a),
                  new aaw.c<>(abg.b, abg.a),
                  new aaw.c<>(abh.b, abh.a),
                  new aaw.c<>(abi.b, abi.a),
                  new aaw.c<>(abj.b, abj.a),
                  new aaw.c<>(abk.b, abk.a),
                  new aaw.c<>(abl.b, abl.a),
                  new aaw.c<>(abm.b, abm.a)
               }
            ),
            $$0 -> {
            }
         )
      )
      .a(aac::new, aac::b);
   public static final zm<wl, aac> b = aaw.<wl>a($$0 -> aax.a($$0, 1048576), List.of(new aaw.c<>(aau.b, aau.a))).a(aac::new, aac::b);

   @Override
   public zx<aac> a() {
      return aal.a;
   }

   public void a(aab $$0) {
      $$0.a(this);
   }

   public aaw b() {
      return this.c;
   }
}
