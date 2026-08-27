import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class ede extends edb {
   public static final Codec<ede> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aqa.a(jc.D).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, ede::new)
   );
   private final aqa<cis> j;
   private final boolean k;

   private ede(aqa<cis> $$0, boolean $$1, int $$2, int $$3, List<eff> $$4, List<edt> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public eda a() {
      return ecx.f;
   }

   @Override
   public void a(Consumer<cix> $$0, ecg $$1) {
      jb.i.c(this.j).forEach($$1x -> $$0.accept(new cix($$1x)));
   }

   private boolean a(ecg $$0, Consumer<ecy> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final he<cis> $$2 : jb.i.c(this.j)) {
            $$1.accept(new edb.c() {
               @Override
               public void a(Consumer<cix> $$0, ecg $$1) {
                  $$0.accept(new cix($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(ecg $$0, Consumer<ecy> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static edb.a<?> a(aqa<cis> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ede($$0, false, $$1, $$2, $$3, $$4));
   }

   public static edb.a<?> b(aqa<cis> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ede($$0, true, $$1, $$2, $$3, $$4));
   }
}
