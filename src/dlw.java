import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dlw extends dli {
   public static final MapCodec<dlw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cyl.q.fieldOf("color").forGetter(dli::b), t()).apply($$0, dlw::new));
   public static final ebt b = ebj.bd;
   private static final Map<cyl, dmr> c = Maps.newHashMap();
   private static final ffw d = dmr.b(8.0, 0.0, 16.0);

   @Override
   public MapCodec<dlw> a() {
      return a;
   }

   public dlw(cyl $$0, eas.d $$1) {
      super($$0, $$1);
      this.l(this.C.b().b(b, Integer.valueOf(0)));
      c.put($$0, this);
   }

   @Override
   protected boolean a(eat $$0, djp $$1, iv $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return d;
   }

   @Override
   public eat a(ddg $$0) {
      return this.m().b(b, Integer.valueOf(ebz.a($$0.i() + 180.0F)));
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      return $$4 == jb.a && !$$0.a($$1, $$3) ? dmt.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
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
      $$0.a(b);
   }

   public static dmr a(cyl $$0) {
      return c.getOrDefault($$0, dmt.jl);
   }
}
