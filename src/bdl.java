import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import java.util.stream.IntStream;

public class bdl extends DataFix {
   private static final long a = 32L;
   private static final long b = 4294967295L;

   public bdl(Schema $$0) {
      super($$0, false);
   }

   protected TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "ChunkTicketUnpackPosFix",
         this.getInputSchema().getType(biz.i),
         $$0 -> $$0.update(
               DSL.remainderFinder(),
               $$0x -> $$0x.update(
                     "data",
                     $$0xx -> $$0xx.update("tickets", $$0xxx -> $$0xxx.createList($$0xxx.asStream().map($$0xxxx -> $$0xxxx.update("chunk_pos", $$0xxxxx -> {
                                 long $$1 = $$0xxxxx.asLong(0L);
                                 int $$2 = (int)($$1 & 4294967295L);
                                 int $$3 = (int)($$1 >>> 32 & 4294967295L);
                                 return $$0xxxxx.createIntList(IntStream.of($$2, $$3));
                              }))))
                  )
            )
      );
   }
}
