import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class edf extends edc {
   public static final Codec<edf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aqa.a(jc.D).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, edf::new)
   );
   private final aqa<cit> j;
   private final boolean k;

   private edf(aqa<cit> $$0, boolean $$1, int $$2, int $$3, List<efg> $$4, List<edu> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public edb a() {
      return ecy.f;
   }

   @Override
   public void a(Consumer<ciy> $$0, ech $$1) {
      jb.i.c(this.j).forEach($$1x -> $$0.accept(new ciy($$1x)));
   }

   private boolean a(ech $$0, Consumer<ecz> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final he<cit> $$2 : jb.i.c(this.j)) {
            $$1.accept(new edc.c() {
               @Override
               public void a(Consumer<ciy> $$0, ech $$1) {
                  $$0.accept(new ciy($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(ech $$0, Consumer<ecz> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static edc.a<?> a(aqa<cit> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new edf($$0, false, $$1, $$2, $$3, $$4));
   }

   public static edc.a<?> b(aqa<cit> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new edf($$0, true, $$1, $$2, $$3, $$4));
   }
}
