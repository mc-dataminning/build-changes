import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

public class dpk {
   static final String a = "shared_data";
   static Codec<dpk> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               csd.a("display_item").forGetter($$0x -> $$0x.d),
               jp.c.optionalFieldOf("connected_players", Set.of()).forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.optionalFieldOf("connected_particles_range", dpi.b.d()).forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dpk::new)
   );
   private csd d = csd.i;
   private Set<UUID> e = new ObjectLinkedOpenHashSet();
   private double f = dpi.b.d();
   boolean c;

   dpk(csd $$0, Set<UUID> $$1, double $$2) {
      this.d = $$0;
      this.e.addAll($$1);
      this.f = $$2;
   }

   dpk() {
   }

   public csd a() {
      return this.d;
   }

   public boolean b() {
      return !this.d.d();
   }

   public void a(csd $$0) {
      if (!csd.a(this.d, $$0)) {
         this.d = $$0.r();
         this.f();
      }
   }

   boolean c() {
      return !this.e.isEmpty();
   }

   Set<UUID> d() {
      return this.e;
   }

   double e() {
      return this.f;
   }

   void a(aqe $$0, im $$1, dpj $$2, dpi $$3, double $$4) {
      Set<UUID> $$5 = $$3.a().detect($$0, $$3.g(), $$1, $$4).stream().filter($$1x -> !$$2.b().contains($$1x)).collect(Collectors.toSet());
      if (!this.e.equals($$5)) {
         this.e = $$5;
         this.f();
      }
   }

   private void f() {
      this.c = true;
   }

   void a(dpk $$0) {
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
   }
}
