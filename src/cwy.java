import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cwy extends dcy {
   public static final MapCodec<cwy> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dkc.a.fieldOf("wood_type").forGetter(dcy::d), u()).apply($$0, cwy::new));
   public static final djp b = djf.ba;
   public static final djg c = djf.a;
   protected static final float d = 5.0F;
   protected static final elu e = cvz.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final Map<Integer, elu> i = Maps.newHashMap(
      ImmutableMap.of(
         0,
         cvz.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         4,
         cvz.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0),
         8,
         cvz.a(1.0, 0.0, 7.0, 15.0, 10.0, 9.0),
         12,
         cvz.a(7.0, 0.0, 1.0, 9.0, 10.0, 15.0)
      )
   );

   @Override
   public MapCodec<cwy> a() {
      return a;
   }

   public cwy(dkc $$0, dio.d $$1) {
      super($$0, $$1.a($$0.e()));
      this.k(this.E.b().a(b, Integer.valueOf(0)).a(c, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
   }

   @Override
   public bjl a(dip $$0, csy $$1, hv $$2, cer $$3, bjk $$4, ekx $$5) {
      if ($$1.c_($$2) instanceof dhm $$6) {
         cmh $$7 = $$3.b($$4);
         if (this.a($$3, $$5, $$6, $$7)) {
            return bjl.d;
         }
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(cer $$0, ekx $$1, dhm $$2, cmh $$3) {
      return !$$2.a($$2.a($$0), $$0) && $$3.d() instanceof clt && $$1.b().equals(ia.a);
   }

   @Override
   public boolean a(dip $$0, ctb $$1, hv $$2) {
      return $$1.a_($$2.c()).a($$1, $$2.c(), ia.a, ddz.b);
   }

   @Override
   public dip a(coq $$0) {
      csy $$1 = $$0.q();
      edz $$2 = $$1.b_($$0.a());
      hv $$3 = $$0.a().c();
      dip $$4 = $$1.a_($$3);
      boolean $$5 = $$4.a(arr.az);
      ia $$6 = ia.a((double)$$0.i());
      boolean $$7 = !cvz.a($$4.k($$1, $$3), ia.a) || $$0.h();
      if ($$5 && !$$0.h()) {
         if ($$4.b(dew.b)) {
            ia $$8 = $$4.c(dew.b);
            if ($$8.o().a($$6)) {
               $$7 = false;
            }
         } else if ($$4.b(b)) {
            Optional<ia> $$9 = djv.a($$4.c(b));
            if ($$9.isPresent() && $$9.get().o().a($$6)) {
               $$7 = false;
            }
         }
      }

      int $$10 = !$$7 ? djv.a($$6.g()) : djv.a($$0.i() + 180.0F);
      return this.o().a(c, Boolean.valueOf($$7)).a(b, Integer.valueOf($$10)).a(f, Boolean.valueOf($$2.a() == eea.c));
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      elu $$4 = i.get($$0.c(b));
      return $$4 == null ? e : $$4;
   }

   @Override
   public elu b_(dip $$0, cse $$1, hv $$2) {
      return this.a($$0, $$1, $$2, elg.a());
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      return $$1 == ia.b && !this.a($$0, $$3, $$4) ? cwb.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public float g(dip $$0) {
      return djv.b($$0.c(b));
   }

   @Override
   public dip a(dip $$0, dcl $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   public dip a(dip $$0, dav $$1) {
      return $$0.a(b, Integer.valueOf($$1.a($$0.c(b), 16)));
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(b, c, f);
   }

   @Override
   public dgd a(hv $$0, dip $$1) {
      return new dha($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgd> dge<T> a(csy $$0, dip $$1, dgf<T> $$2) {
      return a($$2, dgf.i, dhm::a);
   }
}
