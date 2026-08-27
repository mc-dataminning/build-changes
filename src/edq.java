import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class edq extends edn {
   public static final Codec<edq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(aqj.a(je.D).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, edq::new)
   );
   private final aqj<cjc> j;
   private final boolean k;

   private edq(aqj<cjc> $$0, boolean $$1, int $$2, int $$3, List<efr> $$4, List<eef> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public edm a() {
      return edj.f;
   }

   @Override
   public void a(Consumer<cjh> $$0, ecs $$1) {
      jd.i.c(this.j).forEach($$1x -> $$0.accept(new cjh($$1x)));
   }

   private boolean a(ecs $$0, Consumer<edk> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final hg<cjc> $$2 : jd.i.c(this.j)) {
            $$1.accept(new edn.c() {
               @Override
               public void a(Consumer<cjh> $$0, ecs $$1) {
                  $$0.accept(new cjh($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(ecs $$0, Consumer<edk> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static edn.a<?> a(aqj<cjc> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new edq($$0, false, $$1, $$2, $$3, $$4));
   }

   public static edn.a<?> b(aqj<cjc> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new edq($$0, true, $$1, $$2, $$3, $$4));
   }
}
