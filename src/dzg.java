import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class dzg extends dlg {
   public static final MapCodec<dzg> a = b(dzg::new);
   public static final eam<ja> b = dzi.a;
   public static final eam<eaq> c = dzi.c;

   @Override
   public MapCodec<dzg> a() {
      return a;
   }

   public dzg(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, ja.c).b(c, eaq.a));
   }

   @Nullable
   @Override
   public dwn a(iu $$0, dzo $$1) {
      return null;
   }

   public static dwn a(iu $$0, dzo $$1, dzo $$2, ja $$3, boolean $$4, boolean $$5) {
      return new dzk($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends dwn> dwo<T> a(dip $$0, dzo $$1, dwp<T> $$2) {
      return a($$2, dwp.l, dzk::a);
   }

   @Override
   public void a(diq $$0, iu $$1, dzo $$2) {
      iu $$3 = $$1.a($$2.c(b).g());
      dzo $$4 = $$0.a_($$3);
      if ($$4.b() instanceof dzh && $$4.c(dzh.c)) {
         $$0.a($$3, false);
      }
   }

   @Override
   protected bty a(dzo $$0, dip $$1, iu $$2, cqs $$3, fds $$4) {
      if (!$$1.C && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return bty.c;
      } else {
         return bty.e;
      }
   }

   @Override
   protected List<cys> a(dzo $$0, eyq.a $$1) {
      dzk $$2 = this.a($$1.a(), iu.a($$1.a(fbh.f)));
      return $$2 == null ? Collections.emptyList() : $$2.j().a($$1);
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return fen.a();
   }

   @Override
   protected feq b(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      dzk $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : fen.a();
   }

   @Nullable
   private dzk a(dhv $$0, iu $$1) {
      dwn $$2 = $$0.c_($$1);
      return $$2 instanceof dzk ? (dzk)$$2 : null;
   }

   @Override
   protected dsf a_(dzo $$0) {
      return dsf.a;
   }

   @Override
   protected cys a(dis $$0, iu $$1, dzo $$2, boolean $$3) {
      return cys.k;
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
   protected boolean a(dzo $$0, ewk $$1) {
      return false;
   }
}
