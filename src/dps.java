import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dps extends dlg {
   public static final MapCodec<dps> a = b(dps::new);
   public static final eam<ja> b = eae.S;
   public static final eaf c = eae.i;
   private final Function<dzo, feq> d;
   private final Map<ja, feq> e;

   @Override
   public MapCodec<dps> a() {
      return a;
   }

   public dps(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, ja.a).b(c, Boolean.valueOf(true)));
      feq $$1 = dlu.b(12.0, 11.0, 16.0);
      this.d = this.b($$1);
      this.e = ImmutableMap.builderWithExpectedSize(5).putAll(fen.c(fen.a($$1, dlu.a(4.0, 8.0, 10.0, 0.0, 4.0)))).put(ja.a, $$1).build();
   }

   private Function<dzo, feq> b(feq $$0) {
      feq $$1 = fen.a(dlu.b(16.0, 10.0, 16.0), dlu.b(8.0, 4.0, 10.0));
      feq $$2 = fen.a($$1, $$0, fea.e);
      Map<ja, feq> $$3 = fen.d(dlu.a(4.0, 4.0, 8.0, 0.0, 8.0), new fdw(8.0, 6.0, 8.0).c(0.0625));
      return this.a($$2x -> fen.a($$2, fen.a($$3.get($$2x.c(b)), fen.b(), fea.i)), new ear[]{c});
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return this.d.apply($$0);
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2) {
      return this.e.get($$0.c(b));
   }

   @Override
   public dzo a(dcl $$0) {
      ja $$1 = $$0.k().g();
      return this.m().b(b, $$1.o() == ja.a.b ? ja.a : $$1).b(c, Boolean.valueOf(true));
   }

   @Override
   public dwn a(iu $$0, dzo $$1) {
      return new dxq($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dwn> dwo<T> a(dip $$0, dzo $$1, dwp<T> $$2) {
      return $$0.C ? null : a($$2, dwp.s, dxq::a);
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, dzo $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected bty a(dzo $$0, dip $$1, iu $$2, cqs $$3, fds $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dxq $$5) {
         $$3.a($$5);
         $$3.a(awv.ad);
      }

      return bty.a;
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, dlu $$3, @Nullable exd $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(dip $$0, iu $$1, dzo $$2) {
      boolean $$3 = !$$0.D($$1);
      if ($$3 != $$2.c(c)) {
         $$0.a($$1, $$2.b(c, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, boolean $$3) {
      btu.a($$0, $$1, $$2);
   }

   @Override
   protected boolean c_(dzo $$0) {
      return true;
   }

   @Override
   protected int a(dzo $$0, dip $$1, iu $$2) {
      return cuk.a($$1.c_($$2));
   }

   @Override
   protected dzo a(dzo $$0, dsm $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dzo a(dzo $$0, dqv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, bwa $$3) {
      dwn $$4 = $$1.c_($$2);
      if ($$4 instanceof dxq) {
         dxq.a($$1, $$2, $$0, $$3, (dxq)$$4);
      }
   }

   @Override
   protected boolean a(dzo $$0, ewk $$1) {
      return false;
   }
}
