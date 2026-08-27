import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.stream.Stream;

public class cwb implements cvz {
   final cvg a;
   final cvg b;
   final cvg c;

   public cwb(cvg $$0, cvg $$1, cvg $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public boolean a(bnt $$0, cyx $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public crj a(bnt $$0, iz $$1) {
      crj $$2 = $$0.a(1);
      if (this.b.a($$2)) {
         Optional<il.c<ctl>> $$3 = ctm.a($$1, $$0.a(2));
         Optional<il.c<ctn>> $$4 = cto.a($$1, $$0.a(0));
         if ($$3.isPresent() && $$4.isPresent()) {
            ctk $$5 = $$2.a(jp.B);
            if ($$5 != null && $$5.a($$4.get(), $$3.get())) {
               return crj.i;
            }

            crj $$6 = $$2.c(1);
            $$6.b(jp.B, new ctk($$3.get(), $$4.get()));
            return $$6;
         }
      }

      return crj.i;
   }

   @Override
   public crj a(iz $$0) {
      crj $$1 = new crj(crm.pG);
      Optional<il.c<ctn>> $$2 = $$0.d(ks.aL).h().findFirst();
      Optional<il.c<ctl>> $$3 = $$0.d(ks.aK).b(ctm.d);
      if ($$2.isPresent() && $$3.isPresent()) {
         $$1.b(jp.B, new ctk($$3.get(), $$2.get()));
      }

      return $$1;
   }

   @Override
   public boolean a(crj $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(crj $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(crj $$0) {
      return this.c.a($$0);
   }

   @Override
   public cvn<?> ap_() {
      return cvn.v;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cvg::c);
   }

   public static class a implements cvn<cwb> {
      private static final Codec<cwb> y = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cvg.c.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cvg.c.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cvg.c.fieldOf("addition").forGetter($$0x -> $$0x.c)
               )
               .apply($$0, cwb::new)
      );
      public static final ye<vr, cwb> x = ye.a(cwb.a::a, cwb.a::a);

      @Override
      public Codec<cwb> a() {
         return y;
      }

      @Override
      public ye<vr, cwb> b() {
         return x;
      }

      private static cwb a(vr $$0) {
         cvg $$1 = cvg.b.decode($$0);
         cvg $$2 = cvg.b.decode($$0);
         cvg $$3 = cvg.b.decode($$0);
         return new cwb($$1, $$2, $$3);
      }

      private static void a(vr $$0, cwb $$1) {
         cvg.b.encode($$0, $$1.a);
         cvg.b.encode($$0, $$1.b);
         cvg.b.encode($$0, $$1.c);
      }
   }
}
