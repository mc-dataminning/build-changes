import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class edi extends edf {
   public static final Codec<edi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aqk.a(jc.E).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, edi::new)
   );
   private final aqk<cjg> j;
   private final boolean k;

   private edi(aqk<cjg> $$0, boolean $$1, int $$2, int $$3, List<efj> $$4, List<edx> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public ede a() {
      return edb.f;
   }

   @Override
   public void a(Consumer<cjl> $$0, eck $$1) {
      jb.i.c(this.j).forEach($$1x -> $$0.accept(new cjl($$1x)));
   }

   private boolean a(eck $$0, Consumer<edc> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final he<cjg> $$2 : jb.i.c(this.j)) {
            $$1.accept(new edf.c() {
               @Override
               public void a(Consumer<cjl> $$0, eck $$1) {
                  $$0.accept(new cjl($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(eck $$0, Consumer<edc> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static edf.a<?> a(aqk<cjg> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new edi($$0, false, $$1, $$2, $$3, $$4));
   }

   public static edf.a<?> b(aqk<cjg> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new edi($$0, true, $$1, $$2, $$3, $$4));
   }
}
