import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dcl extends cwd {
   public static final MapCodec<dcl> e = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(djv.a.fieldOf("block_set_type").forGetter($$0x -> $$0x.d), u()).apply($$0, dcl::new)
   );
   public static final djx f = djw.w;

   @Override
   public MapCodec<dcl> a() {
      return e;
   }

   protected dcl(djv $$0, djf.d $$1) {
      super($$1, $$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)));
   }

   @Override
   protected int g(djg $$0) {
      return $$0.c(f) ? 15 : 0;
   }

   @Override
   protected djg a(djg $$0, int $$1) {
      return $$0.a(f, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(cto $$0, hx $$1) {
      Class<? extends blu> $$2 = switch (this.d.f()) {
         case a -> blu.class;
         case b -> bmk.class;
      };
      return a($$0, c.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(f);
   }
}
