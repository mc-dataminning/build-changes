import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dul extends dmo {
   public static final MapCodec<dul> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cyw.q.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.e)), t())
            .apply($$0, ($$0x, $$1) -> new dul((cyw)$$0x.orElse(null), $$1))
   );
   public static final Map<jb, fgk> b = fgh.d(dnc.c(16.0, 0.0, 1.0));
   public static final ecc<jb> c = dpg.a;
   public static final ali d = ali.b("contents");
   @Nullable
   private final cyw e;

   @Override
   public MapCodec<dul> a() {
      return a;
   }

   public dul(@Nullable cyw $$0, ebd.d $$1) {
      super($$1);
      this.e = $$0;
      this.l(this.C.b().b(c, jb.b));
   }

   @Override
   public dyc a(iv $$0, ebe $$1) {
      return new dzp(this.e, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dyc> dyd<T> a(djx $$0, ebe $$1, dye<T> $$2) {
      return a($$2, dye.y, dzp::a);
   }

   @Override
   protected bur a(ebe $$0, djx $$1, iv $$2, crx $$3, ffm $$4) {
      if ($$1 instanceof ars $$5 && $$1.c_($$2) instanceof dzp $$6 && a($$0, $$1, $$2, $$6)) {
         $$3.a($$6);
         $$3.a(awz.aq);
         cqn.a($$5, $$3, true);
      }

      return bur.a;
   }

   private static boolean a(ebe $$0, djx $$1, iv $$2, dzp $$3) {
      if ($$3.k() != dzp.a.a) {
         return true;
      } else {
         ffl $$4 = cpf.a(1.0F, $$0.c(c), 0.0F, 0.5F, $$2.c()).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public ebe a(ddr $$0) {
      return this.m().b(c, $$0.k());
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(c);
   }

   @Override
   public ebe a(djx $$0, iv $$1, ebe $$2, crx $$3) {
      dyc $$4 = $$0.c_($$1);
      if ($$4 instanceof dzp $$5) {
         if (!$$0.C && $$3.gl() && !$$5.c()) {
            czy $$6 = b(this.b());
            $$6.b($$4.q());
            coc $$7 = new coc($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.j();
            $$0.b($$7);
         } else {
            $$5.d_($$3);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<czy> a(ebe $$0, fak.a $$1) {
      dyc $$2 = $$1.b(fdb.h);
      if ($$2 instanceof dzp $$3) {
         $$1 = $$1.a(d, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, boolean $$3) {
      bun.a($$0, $$1, $$2);
   }

   @Override
   protected fgk b_(ebe $$0, djb $$1, iv $$2) {
      if ($$1.c_($$2) instanceof dzp $$4 && !$$4.t()) {
         return b.get($$0.c(c).g());
      }

      return fgh.b();
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return $$1.c_($$2) instanceof dzp $$5 ? fgh.a($$5.a($$0)) : fgh.b();
   }

   @Override
   protected boolean e_(ebe $$0) {
      return false;
   }

   @Override
   protected boolean c_(ebe $$0) {
      return true;
   }

   @Override
   protected int a(ebe $$0, djx $$1, iv $$2) {
      return cvq.a($$1.c_($$2));
   }

   public static dnc a(@Nullable cyw $$0) {
      if ($$0 == null) {
         return dne.lv;
      } else {
         return switch ($$0) {
            case a -> dne.lw;
            case b -> dne.lx;
            case c -> dne.ly;
            case d -> dne.lz;
            case e -> dne.lA;
            case f -> dne.lB;
            case g -> dne.lC;
            case h -> dne.lD;
            case i -> dne.lE;
            case j -> dne.lF;
            case l -> dne.lH;
            case m -> dne.lI;
            case n -> dne.lJ;
            case o -> dne.lK;
            case p -> dne.lL;
            case k -> dne.lG;
         };
      }
   }

   @Nullable
   public cyw b() {
      return this.e;
   }

   public static czy b(@Nullable cyw $$0) {
      return new czy(a($$0));
   }

   @Override
   protected ebe a(ebe $$0, dtw $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected ebe a(ebe $$0, dsf $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }
}
