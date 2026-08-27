import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class ddg extends djg {
   public static final MapCodec<ddg> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dqv.a.fieldOf("wood_type").forGetter(djg::d), u()).apply($$0, ddg::new));
   public static final dqi b = dpy.ba;
   public static final dpz c = dpy.a;
   protected static final float d = 5.0F;
   protected static final etc e = dch.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final Map<Integer, etc> i = Maps.newHashMap(
      ImmutableMap.of(
         0,
         dch.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         4,
         dch.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0),
         8,
         dch.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         12,
         dch.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0)
      )
   );

   @Override
   public MapCodec<ddg> a() {
      return a;
   }

   public ddg(dqv $$0, dph.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   protected boh a(crs $$0, dpi $$1, czg $$2, id $$3, cka $$4, boe $$5, esf $$6) {
      if ($$2.c_($$3) instanceof dny $$7 && this.a($$4, $$6, $$7, $$0)) {
         return boh.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(cka $$0, esf $$1, dny $$2, crs $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.f() instanceof crf && $$1.b().equals(ij.a);
   }

   @Override
   protected boolean a(dpi $$0, czj $$1, id $$2) {
      return $$1.a_($$2.c()).a($$1, $$2.c(), ij.a, dkh.b);
   }

   @Override
   public dpi a(cux $$0) {
      czg $$1 = $$0.q();
      elb $$2 = $$1.b_($$0.a());
      id $$3 = $$0.a().c();
      dpi $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(ave.aA);
      ij $$6 = ij.a((double)$$0.i());
      boolean $$7 = !dch.a($$4.k($$1, $$3), ij.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(dlf.b)) {
            ij $$8 = $$4.c(dlf.b);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(b)) {
            Optional<ij> $$9 = dqo.a($$4.c(b));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? dqo.a($$6.g()) : dqo.a($$0.i() + 180.0F);
      return this.n().a(c, Boolean.valueOf($$7)).a(b, Integer.valueOf($$10)).a(f, Boolean.valueOf($$2.a() == elc.c));
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      etc $$4 = i.get($$0.c(b));
      return $$4 == null ? e : $$4;
   }

   @Override
   protected etc b_(dpi $$0, cym $$1, id $$2) {
      return this.a($$0, $$1, $$2, eso.a());
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      return $$1 == ij.b && !this.a($$0, $$3, $$4) ? dcj.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dpi $$0) {
      return dqo.b($$0.c(b));
   }

   @Override
   protected dpi a(dpi $$0, dit $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dpi a(dpi $$0, dhd $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(b, c, f);
   }

   @Override
   public dmo a(id $$0, dpi $$1) {
      return new dnl($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dmo> dmp<T> a(czg $$0, dpi $$1, dmq<T> $$2) {
      return a($$2, dmq.i, dny::a);
   }
}
