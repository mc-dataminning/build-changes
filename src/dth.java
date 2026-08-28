import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class dth extends dlm {
   public static final MapCodec<dth> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(cxw.q.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.e)), t())
            .apply($$0, ($$0x, $$1) -> new dth((cxw)$$0x.orElse(null), $$1))
   );
   public static final Map<ja, ffc> b = fez.d(dma.c(16.0, 0.0, 1.0));
   public static final eax<ja> c = doe.a;
   public static final alg d = alg.b("contents");
   @Nullable
   private final cxw e;

   @Override
   public MapCodec<dth> a() {
      return a;
   }

   public dth(@Nullable cxw $$0, dzy.d $$1) {
      super($$1);
      this.e = $$0;
      this.l(this.B.b().b(c, ja.b));
   }

   @Override
   public dwx a(iu $$0, dzz $$1) {
      return new dyk(this.e, $$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dwx> dwy<T> a(div $$0, dzz $$1, dwz<T> $$2) {
      return a($$2, dwz.y, dyk::a);
   }

   @Override
   protected bub a(dzz $$0, div $$1, iu $$2, cqy $$3, fee $$4) {
      if ($$1 instanceof arq $$5 && $$1.c_($$2) instanceof dyk $$6 && a($$0, $$1, $$2, $$6)) {
         $$3.a($$6);
         $$3.a(awx.aq);
         cpo.a($$5, $$3, true);
      }

      return bub.a;
   }

   private static boolean a(dzz $$0, div $$1, iu $$2, dyk $$3) {
      if ($$3.k() != dyk.a.a) {
         return true;
      } else {
         fed $$4 = cof.a(1.0F, $$0.c(c), 0.0F, 0.5F, $$2.c()).h(1.0E-6);
         return $$1.b($$4);
      }
   }

   @Override
   public dzz a(dcr $$0) {
      return this.m().b(c, $$0.k());
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(c);
   }

   @Override
   public dzz a(div $$0, iu $$1, dzz $$2, cqy $$3) {
      dwx $$4 = $$0.c_($$1);
      if ($$4 instanceof dyk $$5) {
         if (!$$0.C && $$3.gk() && !$$5.c()) {
            cyy $$6 = b(this.b());
            $$6.b($$4.q());
            cnd $$7 = new cnd($$0, (double)$$1.u() + 0.5, (double)$$1.v() + 0.5, (double)$$1.w() + 0.5, $$6);
            $$7.j();
            $$0.b($$7);
         } else {
            $$5.d_($$3);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cyy> a(dzz $$0, ezc.a $$1) {
      dwx $$2 = $$1.b(fbt.h);
      if ($$2 instanceof dyk $$3) {
         $$1 = $$1.a(d, $$1x -> {
            for (int $$2x = 0; $$2x < $$3.b(); $$2x++) {
               $$1x.accept($$3.a($$2x));
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, boolean $$3) {
      btx.a($$0, $$1, $$2);
   }

   @Override
   protected ffc b_(dzz $$0, dib $$1, iu $$2) {
      if ($$1.c_($$2) instanceof dyk $$4 && !$$4.t()) {
         return b.get($$0.c(c).g());
      }

      return fez.b();
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return $$1.c_($$2) instanceof dyk $$5 ? fez.a($$5.a($$0)) : fez.b();
   }

   @Override
   protected boolean e_(dzz $$0) {
      return false;
   }

   @Override
   protected boolean c_(dzz $$0) {
      return true;
   }

   @Override
   protected int a(dzz $$0, div $$1, iu $$2) {
      return cuq.a($$1.c_($$2));
   }

   public static dma a(@Nullable cxw $$0) {
      if ($$0 == null) {
         return dmc.ls;
      } else {
         return switch ($$0) {
            case a -> dmc.lt;
            case b -> dmc.lu;
            case c -> dmc.lv;
            case d -> dmc.lw;
            case e -> dmc.lx;
            case f -> dmc.ly;
            case g -> dmc.lz;
            case h -> dmc.lA;
            case i -> dmc.lB;
            case j -> dmc.lC;
            case l -> dmc.lE;
            case m -> dmc.lF;
            case n -> dmc.lG;
            case o -> dmc.lH;
            case p -> dmc.lI;
            case k -> dmc.lD;
         };
      }
   }

   @Nullable
   public cxw b() {
      return this.e;
   }

   public static cyy b(@Nullable cxw $$0) {
      return new cyy(a($$0));
   }

   @Override
   protected dzz a(dzz $$0, dst $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dzz a(dzz $$0, drc $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }
}
