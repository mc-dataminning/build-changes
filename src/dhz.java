import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dhz extends djs implements dkf {
   public static final MapCodec<dhz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dpw.a.fieldOf("tree").forGetter($$0x -> $$0x.i), u()).apply($$0, dhz::new)
   );
   public static final drh b = dqx.at;
   public static final int c = 4;
   private static final eui[] j = new eui[]{
      dde.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0),
      dde.a(7.0, 10.0, 7.0, 9.0, 16.0, 9.0),
      dde.a(7.0, 7.0, 7.0, 9.0, 16.0, 9.0),
      dde.a(7.0, 3.0, 7.0, 9.0, 16.0, 9.0),
      dde.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private static final dqy k = dqx.C;
   public static final dqy d = dqx.j;

   @Override
   public MapCodec<dhz> a() {
      return a;
   }

   public dhz(dpw $$0, dqg.d $$1) {
      super($$0, $$1);
      this.k(this.E.b().a(f, Integer.valueOf(0)).a(b, Integer.valueOf(0)).a(k, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(f).a(b).a(k).a(d);
   }

   @Override
   protected boolean b(dqh $$0, czj $$1, in $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(ddg.dR);
   }

   @Nullable
   @Override
   public dqh a(cwi $$0) {
      ema $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == emb.c;
      return super.a($$0).a(k, Boolean.valueOf($$2)).a(b, Integer.valueOf(4));
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      etp $$4 = $$0.n($$1, $$2);
      eui $$5;
      if (!$$0.c(d)) {
         $$5 = j[4];
      } else {
         $$5 = j[$$0.c(b)];
      }

      return $$5.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   protected boolean a(dqh $$0, dag $$1, in $$2) {
      return m($$0) ? $$1.a_($$2.c()).a(ddg.aL) : super.a($$0, $$1, $$2);
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if ($$0.c(k)) {
         $$3.a($$4, emb.c, emb.c.a($$3));
      }

      return $$1 == is.b && !$$0.a($$3, $$4) ? ddg.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ema b_(dqh $$0) {
      return $$0.c(k) ? emb.c.a(false) : super.b_($$0);
   }

   @Override
   protected void b(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      if (!m($$0)) {
         if ($$3.a(7) == 0) {
            this.a($$1, $$2, $$0, $$3);
         }
      } else {
         if (!n($$0)) {
            $$1.a($$2, $$0.a(b), 2);
         }
      }
   }

   @Override
   public boolean b(dag $$0, in $$1, dqh $$2) {
      return !m($$2) || !n($$2);
   }

   @Override
   public boolean a(dad $$0, ayg $$1, in $$2, dqh $$3) {
      return m($$3) ? !n($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(aqh $$0, ayg $$1, in $$2, dqh $$3) {
      if (m($$3) && !n($$3)) {
         $$0.a($$2, $$3.a(b), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean m(dqh $$0) {
      return $$0.c(d);
   }

   private static boolean n(dqh $$0) {
      return $$0.c(b) == 4;
   }

   public static dqh c() {
      return b(0);
   }

   public static dqh b(int $$0) {
      return ddg.E.n().a(d, Boolean.valueOf(true)).a(b, Integer.valueOf($$0));
   }
}
