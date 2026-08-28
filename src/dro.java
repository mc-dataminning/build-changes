import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

public class dro {
   static final String a = "shared_data";
   static Codec<dro> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cup.a("display_item").forGetter($$0x -> $$0x.d),
               kc.c.lenientOptionalFieldOf("connected_players", Set.of()).forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.lenientOptionalFieldOf("connected_particles_range", drm.b.d()).forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dro::new)
   );
   private cup d = cup.l;
   private Set<UUID> e = new ObjectLinkedOpenHashSet();
   private double f = drm.b.d();
   boolean c;

   dro(cup $$0, Set<UUID> $$1, double $$2) {
      this.d = $$0;
      this.e.addAll($$1);
      this.f = $$2;
   }

   dro() {
   }

   public cup a() {
      return this.d;
   }

   public boolean b() {
      return !this.d.e();
   }

   public void a(cup $$0) {
      if (!cup.a(this.d, $$0)) {
         this.d = $$0.s();
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

   void a(arf $$0, iz $$1, drn $$2, drm $$3, double $$4) {
      Set<UUID> $$5 = $$3.a().detect($$0, $$3.g(), $$1, $$4, false).stream().filter($$1x -> !$$2.b().contains($$1x)).collect(Collectors.toSet());
      if (!this.e.equals($$5)) {
         this.e = $$5;
         this.f();
      }
   }

   private void f() {
      this.c = true;
   }

   void a(dro $$0) {
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
   }
}
