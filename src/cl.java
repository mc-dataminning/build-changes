import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.Optional;

public class cl extends dh<cl.a> {
   @Override
   public Codec<cl.a> a() {
      return cl.a.a;
   }

   public void a(aqu $$0, ir $$1, cuh $$2) {
      aqt $$3 = $$0.B();
      dtc $$4 = $$3.a_($$1);
      ers $$5 = new ers.a($$3).a(eug.f, $$1.b()).a(eug.a, $$0).a(eug.g, $$4).a(eug.i, $$2).a(euf.n);
      erp $$6 = new erp.a($$5).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$6));
   }

   public static record a(Optional<bd> b, Optional<bd> c) implements dh.a {
      public static final Codec<cl.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axu.a(bs.b, "player").forGetter(cl.a::a), axu.a(bd.a, "location").forGetter(cl.a::b)).apply($$0, cl.a::new)
      );

      public static ao<cl.a> a(dfc $$0) {
         bd $$1 = bd.a(eut.a($$0).build());
         return an.z.a(new cl.a(Optional.empty(), Optional.of($$1)));
      }

      public static ao<cl.a> a(euu.a... $$0) {
         bd $$1 = bd.a(Arrays.stream($$0).map(euu.a::build).toArray(euu[]::new));
         return an.z.a(new cl.a(Optional.empty(), Optional.of($$1)));
      }

      private static cl.a c(cs.a $$0, ci.a $$1) {
         bd $$2 = bd.a(eus.a($$0).build(), evc.a($$1).build());
         return new cl.a(Optional.empty(), Optional.of($$2));
      }

      public static ao<cl.a> a(cs.a $$0, ci.a $$1) {
         return an.N.a(c($$0, $$1));
      }

      public static ao<cl.a> b(cs.a $$0, ci.a $$1) {
         return an.aa.a(c($$0, $$1));
      }

      public boolean a(erp $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(be $$0) {
         dh.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, euf.n, ".location"));
      }

      @Override
      public Optional<bd> a() {
         return this.b;
      }

      public Optional<bd> b() {
         return this.c;
      }
   }
}
