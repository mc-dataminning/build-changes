import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cwe extends dce {
   public static final MapCodec<cwe> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dja.a.fieldOf("wood_type").forGetter(dce::d), u()).apply($$0, cwe::new));
   public static final din b = did.ba;
   public static final die c = did.a;
   protected static final float d = 5.0F;
   protected static final eks e = cvf.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final Map<Integer, eks> i = Maps.newHashMap(
      ImmutableMap.of(
         0,
         cvf.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         4,
         cvf.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0),
         8,
         cvf.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         12,
         cvf.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0)
      )
   );

   @Override
   public MapCodec<cwe> a() {
      return a;
   }

   public cwe(dja $$0, dhm.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   public bjb a(dhn $$0, csf $$1, hx $$2, cdz $$3, bja $$4, ejv $$5) {
      if ($$1.c_($$2) instanceof dgr $$6) {
         clo $$7 = $$3.b($$4);
         if (this.a($$3, $$5, $$6, $$7)) {
            return bjb.d;
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(cdz $$0, ejv $$1, dgr $$2, clo $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.d() instanceof cla && $$1.b().equals(ib.a);
   }

   @Override
   public boolean a(dhn $$0, csi $$1, hx $$2) {
      return $$1.a_($$2.c()).a($$1, $$2.c(), ib.a, ddf.b);
   }

   @Override
   public dhn a(cnw $$0) {
      csf $$1 = $$0.q();
      ecx $$2 = $$1.b_($$0.a());
      hx $$3 = $$0.a().c();
      dhn $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(ark.az);
      ib $$6 = ib.a((double)$$0.i());
      boolean $$7 = !cvf.a($$4.k($$1, $$3), ib.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(deb.b)) {
            ib $$8 = $$4.c(deb.b);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(b)) {
            Optional<ib> $$9 = dit.a($$4.c(b));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? dit.a($$6.g()) : dit.a($$0.i() + 180.0F);
      return this.o().a(c, Boolean.valueOf($$7)).a(b, Integer.valueOf($$10)).a(f, Boolean.valueOf($$2.a() == ecy.c));
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      eks $$4 = i.get($$0.c(b));
      return $$4 == null ? e : $$4;
   }

   @Override
   public eks b_(dhn $$0, crl $$1, hx $$2) {
      return this.a($$0, $$1, $$2, eke.a());
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      return $$1 == ib.b && !this.a($$0, $$3, $$4) ? cvh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dhn $$0) {
      return dit.b($$0.c(b));
   }

   @Override
   public dhn a(dhn $$0, dbr $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   public dhn a(dhn $$0, dab $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(b, c, f);
   }

   @Override
   public dfi a(hx $$0, dhn $$1) {
      return new dgf($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dfi> dfj<T> a(csf $$0, dhn $$1, dfk<T> $$2) {
      return a($$2, dfk.i, dgr::a);
   }
}
