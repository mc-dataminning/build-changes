import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

public class dso {
   static final String a = "shared_data";
   static Codec<dso> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cuh.a("display_item").forGetter($$0x -> $$0x.d),
               ju.c.optionalFieldOf("connected_players", Set.of()).forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.optionalFieldOf("connected_particles_range", dsm.b.d()).forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dso::new)
   );
   private cuh d = cuh.i;
   private Set<UUID> e = new ObjectLinkedOpenHashSet();
   private double f = dsm.b.d();
   boolean c;

   dso(cuh $$0, Set<UUID> $$1, double $$2) {
      this.d = $$0;
      this.e.addAll($$1);
      this.f = $$2;
   }

   dso() {
   }

   public cuh a() {
      return this.d;
   }

   public boolean b() {
      return !this.d.d();
   }

   public void a(cuh $$0) {
      if (!cuh.a(this.d, $$0)) {
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

   void a(aqt $$0, ir $$1, dsn $$2, dsm $$3, double $$4) {
      Set<UUID> $$5 = $$3.a().detect($$0, $$3.g(), $$1, $$4).stream().filter($$1x -> !$$2.b().contains($$1x)).collect(Collectors.toSet());
      if (!this.e.equals($$5)) {
         this.e = $$5;
         this.f();
      }
   }

   private void f() {
      this.c = true;
   }

   void a(dso $$0) {
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
   }
}
