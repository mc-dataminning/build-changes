import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

public class dsm {
   static final String a = "shared_data";
   static Codec<dsm> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cuo.a("display_item").forGetter($$0x -> $$0x.d),
               kg.c.lenientOptionalFieldOf("connected_players", Set.of()).forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.lenientOptionalFieldOf("connected_particles_range", dsk.b.d()).forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dsm::new)
   );
   private cuo d = cuo.l;
   private Set<UUID> e = new ObjectLinkedOpenHashSet();
   private double f = dsk.b.d();
   boolean c;

   dsm(cuo $$0, Set<UUID> $$1, double $$2) {
      this.d = $$0;
      this.e.addAll($$1);
      this.f = $$2;
   }

   dsm() {
   }

   public cuo a() {
      return this.d;
   }

   public boolean b() {
      return !this.d.e();
   }

   public void a(cuo $$0) {
      if (!cuo.a(this.d, $$0)) {
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

   void a(aqt $$0, jd $$1, dsl $$2, dsk $$3, double $$4) {
      Set<UUID> $$5 = $$3.a().detect($$0, $$3.g(), $$1, $$4, false).stream().filter($$1x -> !$$2.b().contains($$1x)).collect(Collectors.toSet());
      if (!this.e.equals($$5)) {
         this.e = $$5;
         this.f();
      }
   }

   private void f() {
      this.c = true;
   }

   void a(dsm $$0) {
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
   }
}
