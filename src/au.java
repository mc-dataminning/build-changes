import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class au extends dh<au.a> {
   @Override
   public Codec<au.a> a() {
      return au.a.a;
   }

   public void a(aqu $$0, ir $$1, cuh $$2) {
      aqt $$3 = $$0.B();
      dtc $$4 = $$3.a_($$1);
      ers $$5 = new ers.a($$3).a(eug.f, $$1.b()).a(eug.a, $$0).a(eug.g, $$4).a(eug.i, $$2).a(euf.n);
      erp $$6 = new erp.a($$5).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$6));
   }

   public static record a(Optional<bd> b, Optional<bd> c) implements dh.a {
      public static final Codec<au.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axu.a(bs.b, "player").forGetter(au.a::a), axu.a(bd.a, "location").forGetter(au.a::b)).apply($$0, au.a::new)
      );

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
