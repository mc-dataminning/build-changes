import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class dev extends cso {
   public static final MapCodec<dev> a = b(dev::new);
   public static final dfx b = dex.a;
   public static final dgb<dgf> c = dex.c;

   @Override
   public MapCodec<dev> a() {
      return a;
   }

   public dev(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ha.c).a(c, dgf.a));
   }

   @Nullable
   @Override
   public dcz a(gw $$0, dfd $$1) {
      return null;
   }

   public static dcz a(gw $$0, dfd $$1, dfd $$2, ha $$3, boolean $$4, boolean $$5) {
      return new dez($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public <T extends dcz> dda<T> a(cqb $$0, dfd $$1, ddb<T> $$2) {
      return a($$2, ddb.k, dez::a);
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, dfd $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dcz $$5 = $$1.c_($$2);
         if ($$5 instanceof dez) {
            ((dez)$$5).j();
         }
      }
   }

   @Override
   public void a(cqc $$0, gw $$1, dfd $$2) {
      gw $$3 = $$1.a($$2.c(b).g());
      dfd $$4 = $$0.a_($$3);
      if ($$4.b() instanceof dew && $$4.c(dew.c)) {
         $$0.a($$3, false);
      }
   }

   @Override
   public bhe a(dfd $$0, cqb $$1, gw $$2, cca $$3, bhd $$4, ehd $$5) {
      if (!$$1.B && $$1.c_($$2) == null) {
         $$1.a($$2, false);
         return bhe.b;
      } else {
         return bhe.d;
      }
   }

   @Override
   public List<cjl> a(dfd $$0, ecq.a $$1) {
      dez $$2 = this.a($$1.a(), gw.a($$1.a(eev.f)));
      return $$2 == null ? Collections.emptyList() : $$2.i().a($$1);
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return ehx.a();
   }

   @Override
   public eia c(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      dez $$4 = this.a($$1, $$2);
      return $$4 != null ? $$4.a($$1, $$2) : ehx.a();
   }

   @Nullable
   private dez a(cph $$0, gw $$1) {
      dcz $$2 = $$0.c_($$1);
      return $$2 instanceof dez ? (dez)$$2 : null;
   }

   @Override
   public cjl a(cqe $$0, gw $$1, dfd $$2) {
      return cjl.b;
   }

   @Override
   public dfd a(dfd $$0, czn $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dfd a(dfd $$0, cxx $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(b, c);
   }

   @Override
   public boolean a(dfd $$0, cph $$1, gw $$2, eaw $$3) {
      return false;
   }
}
