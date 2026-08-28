import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dns extends dub {
   public static final MapCodec<dns> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ech.a.fieldOf("wood_type").forGetter(dub::d), t()).apply($$0, dns::new));
   public static final ebt b = ebj.bd;
   public static final ebk c = ebj.a;
   private static final ffw e = dmr.b(10.0, 0.0, 16.0);
   private static final Map<Integer, ffw> f = fft.c(dmr.a(14.0, 2.0, 0.0, 10.0))
      .entrySet()
      .stream()
      .collect(Collectors.toMap($$0 -> ebz.a($$0.getKey()), Entry::getValue));

   @Override
   public MapCodec<dns> a() {
      return a;
   }

   public dns(ech $$0, eas.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.l(this.C.b().b(b, Integer.valueOf(0)).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected bug a(czn $$0, eat $$1, djm $$2, iv $$3, crm $$4, buf $$5, fey $$6) {
      if ($$2.c_($$3) instanceof dzf $$7 && this.a($$4, $$6, $$7, $$0)) {
         return bug.e;
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   private boolean a(crm $$0, fey $$1, dzf $$2, czn $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.h() instanceof czc && $$1.c().equals(jb.a);
   }

   @Override
   protected boolean a(eat $$0, djp $$1, iv $$2) {
      return $$1.a_($$2.d()).a($$1, $$2.d(), jb.a, dvc.b);
   }

   @Override
   public eat a(ddg $$0) {
      djm $$1 = $$0.q();
      exa $$2 = $$1.b_($$0.a());
      iv $$3 = $$0.a().d();
      eat $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(axc.aD);
      jb $$6 = jb.a((double)$$0.i());
      boolean $$7 = !dmr.a($$4.g($$1, $$3), jb.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(dwh.b)) {
            jb $$8 = $$4.c(dwh.b);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(b)) {
            Optional<jb> $$9 = ebz.a($$4.c(b));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? ebz.a($$6.g()) : ebz.a($$0.i() + 180.0F);
      return this.m().b(c, Boolean.valueOf($$7)).b(b, Integer.valueOf($$10)).b(d, Boolean.valueOf($$2.a() == exb.c));
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return f.getOrDefault($$0.c(b), e);
   }

   @Override
   protected ffw b_(eat $$0, diq $$1, iv $$2) {
      return this.a($$0, $$1, $$2, ffh.a());
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      return $$4 == jb.b && !this.a($$0, $$1, $$3) ? dmt.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public float h(eat $$0) {
      return ebz.b($$0.c(b));
   }

   @Override
   protected eat a(eat $$0, dtl $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected eat a(eat $$0, dru $$1) {
      return $$0.b(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dxr a(iv $$0, eat $$1) {
      return new dys($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dxr> dxs<T> a(djm $$0, eat $$1, dxt<T> $$2) {
      return a($$2, dxt.i, dzf::a);
   }
}
