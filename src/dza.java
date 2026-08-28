import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

public class dza {
   static final String a = "shared_data";
   static Codec<dza> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cys.a("display_item").forGetter($$0x -> $$0x.d),
               jy.c.lenientOptionalFieldOf("connected_players", Set.of()).forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.lenientOptionalFieldOf("connected_particles_range", dyy.b.d()).forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dza::new)
   );
   private cys d = cys.k;
   private Set<UUID> e = new ObjectLinkedOpenHashSet();
   private double f = dyy.b.d();
   boolean c;

   dza(cys $$0, Set<UUID> $$1, double $$2) {
      this.d = $$0;
      this.e.addAll($$1);
      this.f = $$2;
   }

   dza() {
   }

   public cys a() {
      return this.d;
   }

   public boolean b() {
      return !this.d.f();
   }

   public void a(cys $$0) {
      if (!cys.a(this.d, $$0)) {
         this.d = $$0.v();
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

   void a(aro $$0, iu $$1, dyz $$2, dyy $$3, double $$4) {
      Set<UUID> $$5 = $$3.a().detect($$0, $$3.g(), $$1, $$4, false).stream().filter($$1x -> !$$2.b().contains($$1x)).collect(Collectors.toSet());
      if (!this.e.equals($$5)) {
         this.e = $$5;
         this.f();
      }
   }

   private void f() {
      this.c = true;
   }

   void a(dza $$0) {
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
   }
}
