import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import javax.annotation.Nullable;

public class dwt extends dum {
   public static final MapCodec<dwt> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ecs.a.fieldOf("wood_type").forGetter(dum::d), t()).apply($$0, dwt::new));
   public static final ecc<jb> b = drd.e;
   private static final Map<jb, fgk> c = fgh.c(dnc.a(16.0, 4.5, 12.5, 14.0, 16.0));

   @Override
   public MapCodec<dwt> a() {
      return a;
   }

   public dwt(ecs $$0, ebd.d $$1) {
      super($$0, $$1.a($$0.d()));
      this.l(this.C.b().b(b, jb.c).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return c.get($$0.c(b));
   }

   @Override
   protected boolean a(ebe $$0, dka $$1, iv $$2) {
      return $$1.a_($$2.a($$0.c(b).g())).e();
   }

   @Nullable
   @Override
   public ebe a(ddr $$0) {
      ebe $$1 = this.m();
      exo $$2 = $$0.q().b_($$0.a());
      dka $$3 = $$0.q();
      iv $$4 = $$0.a();
      jb[] $$5 = $$0.f();

      for (jb $$6 : $$5) {
         if ($$6.o().d()) {
            jb $$7 = $$6.g();
            $$1 = $$1.b(b, $$7);
            if ($$1.a($$3, $$4)) {
               return $$1.b(d, Boolean.valueOf($$2.a() == exp.c));
            }
         }
      }

      return null;
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      return $$4.g() == $$0.c(b) && !$$0.a($$1, $$3) ? dne.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(ebe $$0) {
      return $$0.c(b).p();
   }

   @Override
   public ffq o(ebe $$0) {
      return c.get($$0.c(b)).a().f();
   }

   @Override
   protected ebe a(ebe $$0, dtw $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected ebe a(ebe $$0, dsf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b, d);
   }
}
