import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class eoy extends eov {
   public static final Codec<eoy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(awd.a(ld.G).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, eoy::new)
   );
   private final awd<cry> j;
   private final boolean k;

   private eoy(awd<cry> $$0, boolean $$1, int $$2, int $$3, List<erh> $$4, List<epp> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public eou a() {
      return eor.f;
   }

   @Override
   public void a(Consumer<csd> $$0, eoa $$1) {
      lc.h.c(this.j).forEach($$1x -> $$0.accept(new csd($$1x)));
   }

   private boolean a(eoa $$0, Consumer<eos> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final iv<cry> $$2 : lc.h.c(this.j)) {
            $$1.accept(new eov.c() {
               @Override
               public void a(Consumer<csd> $$0, eoa $$1) {
                  $$0.accept(new csd($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(eoa $$0, Consumer<eos> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static eov.a<?> a(awd<cry> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eoy($$0, false, $$1, $$2, $$3, $$4));
   }

   public static eov.a<?> b(awd<cry> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new eoy($$0, true, $$1, $$2, $$3, $$4));
   }
}
