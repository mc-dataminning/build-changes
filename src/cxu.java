import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;

public class cxu implements cxt {
   final cxa a;
   final cxa b;
   final cxa c;
   final csz d;

   public cxu(cxa $$0, cxa $$1, cxa $$2, csz $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public boolean a(bpf $$0, dad $$1) {
      return this.a.a($$0.a(0)) && this.b.a($$0.a(1)) && this.c.a($$0.a(2));
   }

   @Override
   public csz a(bpf $$0, iy.a $$1) {
      csz $$2 = $$0.a(1).a(this.d.f(), this.d.G());
      $$2.a(this.d.c());
      return $$2;
   }

   @Override
   public csz a(iy.a $$0) {
      return this.d;
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
      return cxh.u;
   }

   @Override
   public boolean i() {
      return Stream.of(this.a, this.b, this.c).anyMatch(cxa::c);
   }

   public static class a implements cxh<cxu> {
      private static final Codec<cxu> y = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  cxa.c.fieldOf("template").forGetter($$0x -> $$0x.a),
                  cxa.c.fieldOf("base").forGetter($$0x -> $$0x.b),
                  cxa.c.fieldOf("addition").forGetter($$0x -> $$0x.c),
                  csz.a.fieldOf("result").forGetter($$0x -> $$0x.d)
               )
               .apply($$0, cxu::new)
      );
      public static final ys<wf, cxu> x = ys.a(cxu.a::a, cxu.a::a);

      @Override
      public Codec<cxu> a() {
         return y;
      }

      @Override
      public ys<wf, cxu> b() {
         return x;
      }

      private static cxu a(wf $$0) {
         cxa $$1 = cxa.b.decode($$0);
         cxa $$2 = cxa.b.decode($$0);
         cxa $$3 = cxa.b.decode($$0);
         csz $$4 = csz.f.decode($$0);
         return new cxu($$1, $$2, $$3, $$4);
      }

      private static void a(wf $$0, cxu $$1) {
         cxa.b.encode($$0, $$1.a);
         cxa.b.encode($$0, $$1.b);
         cxa.b.encode($$0, $$1.c);
         csz.f.encode($$0, $$1.d);
      }
   }
}
