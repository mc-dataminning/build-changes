import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class edj extends edg {
   public static final Codec<edj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aqd.a(je.D).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, edj::new)
   );
   private final aqd<civ> j;
   private final boolean k;

   private edj(aqd<civ> $$0, boolean $$1, int $$2, int $$3, List<efk> $$4, List<edy> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public edf a() {
      return edc.f;
   }

   @Override
   public void a(Consumer<cja> $$0, ecl $$1) {
      jd.i.c(this.j).forEach($$1x -> $$0.accept(new cja($$1x)));
   }

   private boolean a(ecl $$0, Consumer<edd> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final hg<civ> $$2 : jd.i.c(this.j)) {
            $$1.accept(new edg.c() {
               @Override
               public void a(Consumer<cja> $$0, ecl $$1) {
                  $$0.accept(new cja($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(ecl $$0, Consumer<edd> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static edg.a<?> a(aqd<civ> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new edj($$0, false, $$1, $$2, $$3, $$4));
   }

   public static edg.a<?> b(aqd<civ> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new edj($$0, true, $$1, $$2, $$3, $$4));
   }
}
