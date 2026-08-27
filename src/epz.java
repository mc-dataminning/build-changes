import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class epz extends epo {
   public static final Codec<epz> a = RecordCodecBuilder.create(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  akf.a.fieldOf("name").forGetter($$0x -> $$0x.b),
                  axe.a(Codec.LONG, "seed", 0L).forGetter($$0x -> $$0x.c),
                  lc.k.r().fieldOf("type").forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, epz::new)
   );
   private final akf b;
   private final long c;
   private final iv<dnf<?>> d;

   private epz(List<erh> $$0, akf $$1, long $$2, iv<dnf<?>> $$3) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   @Override
   public epq b() {
      return epr.t;
   }

   @Override
   public csd a(csd $$0, eoa $$1) {
      if ($$0.d()) {
         return $$0;
      } else {
         $$0.b(jz.U, new cve(this.b, this.c));
         return $$0;
      }
   }

   @Override
   public void a(eoj $$0) {
      super.a($$0);
      eoc<eoi> $$1 = new eoc<>(eof.c, this.b);
      if ($$0.a().getElementOptional($$1).isEmpty()) {
         $$0.b("Missing loot table used for container: " + this.b);
      }
   }

   public static epo.a<?> a(dnf<?> $$0, akf $$1) {
      return a($$2 -> new epz($$2, $$1, 0L, $$0.a()));
   }

   public static epo.a<?> a(dnf<?> $$0, akf $$1, long $$2) {
      return a($$3 -> new epz($$3, $$1, $$2, $$0.a()));
   }
}
