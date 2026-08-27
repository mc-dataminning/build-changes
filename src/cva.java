import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cva extends cso implements dab {
   public static final MapCodec<cva> a = b(cva::new);
   public static final aez b = new aez("sherds");
   private static final eia d = ctc.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   private static final dfx e = dft.R;
   public static final dfu c = dft.bw;
   private static final dfu f = dft.C;

   @Override
   public MapCodec<cva> a() {
      return a;
   }

   protected cva(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, ha.c).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, eah.c, eah.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dfd a(clt $$0) {
      eag $$1 = $$0.q().b_($$0.a());
      return this.o().a(e, $$0.g()).a(f, Boolean.valueOf($$1.a() == eah.c)).a(c, Boolean.valueOf(false));
   }

   @Override
   public void a(cqb $$0, gw $$1, dfd $$2, @Nullable bjm $$3, cjl $$4) {
      if ($$0.B) {
         $$0.a($$1, ddb.O).ifPresent($$1x -> $$1x.a($$4));
      }
   }

   @Override
   public boolean a(dfd $$0, cph $$1, gw $$2, eaw $$3) {
      return false;
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return d;
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(e, f, c);
   }

   @Nullable
   @Override
   public dcz a(gw $$0, dfd $$1) {
      return new ddo($$0, $$1);
   }

   @Override
   public List<cjl> a(dfd $$0, ecq.a $$1) {
      dcz $$2 = $$1.b(eev.h);
      if ($$2 instanceof ddo $$3) {
         $$1.a(b, $$1x -> $$3.f().a().map(cjg::ai_).forEach($$1x));
      }

      return super.a($$0, $$1);
   }

   @Override
   public dfd a(cqb $$0, gw $$1, dfd $$2, cca $$3) {
      cjl $$4 = $$3.eS();
      dfd $$5 = $$2;
      if ($$4.a(aqd.aT) && !cnw.f($$4)) {
         $$5 = $$2.a(c, Boolean.valueOf(true));
         $$0.a($$1, $$5, 4);
      }

      return super.a($$0, $$1, $$5, $$3);
   }

   @Override
   public eag c_(dfd $$0) {
      return $$0.c(f) ? eah.c.a(false) : super.c_($$0);
   }

   @Override
   public dan m(dfd $$0) {
      return $$0.c(c) ? dan.aY : dan.aX;
   }

   @Override
   public void a(cjl $$0, @Nullable cph $$1, List<tl> $$2, clc $$3) {
      super.a($$0, $$1, $$2, $$3);
      ddo.a $$4 = ddo.a.b(che.a($$0));
      if (!$$4.equals(ddo.a.a)) {
         $$2.add(tk.a);
         Stream.of($$4.e(), $$4.c(), $$4.d(), $$4.b()).forEach($$1x -> $$2.add(new cjl($$1x, 1).y().e().a(n.h)));
      }
   }

   @Override
   public cjl a(cqe $$0, gw $$1, dfd $$2) {
      return $$0.c_($$1) instanceof ddo $$3 ? $$3.g() : super.a($$0, $$1, $$2);
   }
}
