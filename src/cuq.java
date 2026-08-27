import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class cuq extends csr {
   public static final MapCodec<cuq> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(jy.f.q().fieldOf("candle").forGetter($$0x -> $$0x.k), t()).apply($$0, cuq::new)
   );
   public static final dgs d = csr.b;
   protected static final float e = 1.0F;
   protected static final eiy f = cua.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0);
   protected static final eiy g = cua.a(7.0, 8.0, 7.0, 9.0, 14.0, 9.0);
   protected static final eiy h = eiv.a(f, g);
   private static final Map<cua, cuq> i = Maps.newHashMap();
   private static final Iterable<eif> j = ImmutableList.of(new eif(0.5, 1.0, 0.5));
   private final cua k;

   @Override
   public MapCodec<cuq> a() {
      return c;
   }

   protected cuq(cua $$0, dga.d $$1) {
      super($$1);
      this.k(this.E.b().a(d, Boolean.valueOf(false)));
      i.put($$0, this);
      this.k = $$0;
   }

   @Override
   protected Iterable<eif> b(dgb $$0) {
      return j;
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return h;
   }

   @Override
   public bib a(dgb $$0, cqz $$1, ht $$2, ccx $$3, bia $$4, eib $$5) {
      ckj $$6 = $$3.b($$4);
      if ($$6.a(ckm.nE) || $$6.a(ckm.tf)) {
         return bib.d;
      } else if (a($$5) && $$3.b($$4).b() && $$0.c(d)) {
         a($$3, $$0, $$1, $$2);
         return bib.a($$1.B);
      } else {
         bib $$7 = cum.a($$1, $$2, cuc.eg.o(), $$3);
         if ($$7.a()) {
            c($$0, $$1, $$2);
         }

         return $$7;
      }
   }

   private static boolean a(eib $$0) {
      return $$0.e().d - (double)$$0.a().v() > 0.5;
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(d);
   }

   @Override
   public ckj a(crc $$0, ht $$1, dgb $$2) {
      return new ckj(cuc.eg);
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      return $$1 == hx.a && !$$0.a($$3, $$4) ? cuc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dgb $$0, crc $$1, ht $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   public int a(dgb $$0, cqz $$1, ht $$2) {
      return cum.d;
   }

   @Override
   public boolean d_(dgb $$0) {
      return true;
   }

   @Override
   public boolean a(dgb $$0, cqf $$1, ht $$2, ebu $$3) {
      return false;
   }

   public static dgb a(cua $$0) {
      return i.get($$0).o();
   }

   public static boolean g(dgb $$0) {
      return $$0.a(aqs.bj, $$1 -> $$1.b(d) && !$$0.c(d));
   }
}
