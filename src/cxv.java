import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.stream.Stream;

public class cxv implements cxt {
   final cxa a;
   final cxa b;
   final cxa c;

   public cxv(cxa $$0, cxa $$1, cxa $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public boolean a(bpf $$0, dad $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public csz a(bpf $$0, iy.a $$1) {
      csz $$2 = $$0.a(1);
      if (this.b.a($$2)) {
         Optional<iw.c<cvc>> $$3 = cvd.a($$1, $$0.a(2));
         Optional<iw.c<cve>> $$4 = cvf.a($$1, $$0.a(0));
         if ($$3.isPresent() && $$4.isPresent()) {
            cvb $$5 = $$2.a(ka.I);
            if ($$5 != null && $$5.a($$4.get(), $$3.get())) {
               return csz.i;
            }

            csz $$6 = $$2.c(1);
            $$6.b(ka.I, new cvb($$3.get(), $$4.get()));
            return $$6;
         }
      }

      return csz.i;
   }

   @Override
   public csz a(iy.a $$0) {
      csz $$1 = new csz(ctc.pH);
      Optional<iw.c<cve>> $$2 = $$0.b(le.aP).b().findFirst();
      Optional<iw.c<cvc>> $$3 = $$0.b(le.aO).a(cvd.d);
      if ($$2.isPresent() && $$3.isPresent()) {
         $$1.b(ka.I, new cvb($$3.get(), $$2.get()));
      }

      return $$1;
   }

   @Override
   public boolean a(csz $$0) {
      return this.a.a($$0);
   }

   @Override
   public boolean b(csz $$0) {
      return this.b.a($$0);
   }

   @Override
   public boolean c(csz $$0) {
      return this.c.a($$0);
   }

   @Override
   public cxh<?> ao_() {
      return cxh.v;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cxa::c);
   }

   public static class a implements cxh<cxv> {
      private static final Codec<cxv> y = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cxa.c.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cxa.c.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cxa.c.fieldOf("addition").forGetter($$0x -> $$0x.c)
               )
               .apply($$0, cxv::new)
      );
      public static final ys<wf, cxv> x = ys.a(cxv.a::a, cxv.a::a);

      @Override
      public Codec<cxv> a() {
         return y;
      }

      @Override
      public ys<wf, cxv> b() {
         return x;
      }

      private static cxv a(wf $$0) {
         cxa $$1 = cxa.b.decode($$0);
         cxa $$2 = cxa.b.decode($$0);
         cxa $$3 = cxa.b.decode($$0);
         return new cxv($$1, $$2, $$3);
      }

      private static void a(wf $$0, cxv $$1) {
         cxa.b.encode($$0, $$1.a);
         cxa.b.encode($$0, $$1.b);
         cxa.b.encode($$0, $$1.c);
      }
   }
}
