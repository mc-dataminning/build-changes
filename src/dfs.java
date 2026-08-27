import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dfs extends ddl {
   public static final MapCodec<dfs> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(dfp.a.forGetter($$0x -> $$0x.f), u()).apply($$0, dfs::new));
   private final dea f;

   @Override
   public MapCodec<dfs> a() {
      return e;
   }

   protected dfs(dea $$0, drc.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   protected void b(drd $$0, daz $$1, io $$2, drd $$3, boolean $$4) {
      this.a($$0, (dba)$$1, $$2);
   }

   @Override
   protected void a(drd $$0, aqn $$1, io $$2, aym $$3) {
      if (!e($$0, $$1, $$2)) {
         $$1.a($$2, this.f.n().a(d, Boolean.valueOf(false)).a(c, $$0.c(c)), 2);
      }
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      if ($$1.g() == $$0.c(c) && !$$0.a($$3, $$4)) {
         return dec.a.n();
      } else {
         if ($$0.c(d)) {
            $$3.a($$4, emx.c, emx.c.a($$3));
         }

         this.a($$0, $$3, $$4);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
