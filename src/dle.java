import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dle extends drk {
   public static final MapCodec<dle> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dzd.a.fieldOf("wood_type").forGetter(drk::d), t()).apply($$0, dle::new));
   public static final dyq b = dyg.bd;
   public static final dyh c = dyg.a;
   private static final fcr e = dke.b(10.0, 0.0, 16.0);
   private static final Map<Integer, fcr> f = fco.c(dke.a(14.0, 2.0, 0.0, 10.0))
      .entrySet()
      .stream()
      .collect(Collectors.toMap($$0 -> dyw.a($$0.getKey()), Entry::getValue));

   @Override
   public MapCodec<dle> a() {
      return a;
   }

   public dle(dzd $$0, dxp.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.l(this.B.b().b(b, Integer.valueOf(0)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected bsy a(cxh $$0, dxq $$1, dgz $$2, ji $$3, cpr $$4, bsx $$5, fbt $$6) {
      if ($$2.c_($$3) instanceof dwf $$7 && this.a($$4, $$6, $$7, $$0)) {
         return bsy.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(cpr $$0, fbt $$1, dwf $$2, cxh $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.h() instanceof cww && $$1.c().equals(jn.a);
   }

   @Override
   protected boolean a(dxq $$0, dhc $$1, ji $$2) {
      return $$1.a_($$2.d()).a($$1, $$2.d(), jn.a, dsl.b);
   }

   @Override
   public dxq a(dax $$0) {
      dgz $$1 = $$0.q();
      etw $$2 = $$1.b_($$0.a());
      ji $$3 = $$0.a().d();
      dxq $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(awp.aD);
      jn $$6 = jn.a((double)$$0.i());
      boolean $$7 = !dke.a($$4.g($$1, $$3), jn.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(dtj.b)) {
            jn $$8 = $$4.c(dtj.b);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(b)) {
            Optional<jn> $$9 = dyw.a($$4.c(b));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? dyw.a($$6.g()) : dyw.a($$0.i() + 180.0F);
      return this.m().b(c, Boolean.valueOf($$7)).b(b, Integer.valueOf($$10)).b(d, Boolean.valueOf($$2.a() == etx.c));
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return f.getOrDefault($$0.c(b), e);
   }

   @Override
   protected fcr b_(dxq $$0, dgf $$1, ji $$2) {
      return this.a($$0, $$1, $$2, fcc.a());
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      return $$4 == jn.b && !this.a($$0, $$1, $$3) ? dkg.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(dxq $$0) {
      return dyw.b($$0.c(b));
   }

   @Override
   protected dxq a(dxq $$0, dqw $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected dxq a(dxq $$0, dpf $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dus a(ji $$0, dxq $$1) {
      return new dvs($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dus> dut<T> a(dgz $$0, dxq $$1, duu<T> $$2) {
      return a($$2, duu.i, dwf::a);
   }
}
