import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;

public class epg extends epd {
   public static final Codec<epg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(awg.a(le.G).fieldOf("name").forGetter($$0x -> $$0x.j), Codec.BOOL.fieldOf("expand").forGetter($$0x -> $$0x.k))
            .and(b($$0))
            .apply($$0, epg::new)
   );
   private final awg<csu> j;
   private final boolean k;

   private epg(awg<csu> $$0, boolean $$1, int $$2, int $$3, List<erq> $$4, List<epx> $$5) {
      super($$2, $$3, $$4, $$5);
      this.j = $$0;
      this.k = $$1;
   }

   @Override
   public epc a() {
      return eoz.f;
   }

   @Override
   public void a(Consumer<csz> $$0, eol $$1) {
      ld.h.c(this.j).forEach($$1x -> $$0.accept(new csz($$1x)));
   }

   private boolean a(eol $$0, Consumer<epa> $$1) {
      if (!this.a($$0)) {
         return false;
      } else {
         for (final iw<csu> $$2 : ld.h.c(this.j)) {
            $$1.accept(new epd.c() {
               @Override
               public void a(Consumer<csz> $$0, eol $$1) {
                  $$0.accept(new csz($$2));
               }
            });
         }

         return true;
      }
   }

   @Override
   public boolean expand(eol $$0, Consumer<epa> $$1) {
      return this.k ? this.a($$0, $$1) : super.expand($$0, $$1);
   }

   public static epd.a<?> a(awg<csu> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new epg($$0, false, $$1, $$2, $$3, $$4));
   }

   public static epd.a<?> b(awg<csu> $$0) {
      return a(($$1, $$2, $$3, $$4) -> new epg($$0, true, $$1, $$2, $$3, $$4));
   }
}
