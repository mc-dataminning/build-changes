import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bi extends dh<bi.a> {
   @Override
   public Codec<bi.a> a() {
      return bi.a.a;
   }

   public void a(aqu $$0, ir $$1) {
      aqt $$2 = $$0.B();
      dtc $$3 = $$2.a_($$1);
      ers $$4 = new ers.a($$2).a(eug.f, $$1.b()).a(eug.a, $$0).a(eug.g, $$3).a(euf.o);
      erp $$5 = new erp.a($$4).a(Optional.empty());
      this.a($$0, $$1x -> $$1x.a($$5));
   }

   public static record a(Optional<bd> b, Optional<bd> c) implements dh.a {
      public static final Codec<bi.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axu.a(bs.b, "player").forGetter(bi.a::a), axu.a(bd.a, "location").forGetter(bi.a::b)).apply($$0, bi.a::new)
      );

      public boolean a(erp $$0) {
         return this.c.isEmpty() || this.c.get().a($$0);
      }

      @Override
      public void a(be $$0) {
         dh.a.super.a($$0);
         this.c.ifPresent($$1 -> $$0.a($$1, euf.o, ".location"));
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
