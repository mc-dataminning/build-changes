import com.google.common.collect.HashMultimap;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dar(akr b, jm<bur> d, daj e, buu.a f) implements dat {
   public static final MapCodec<dar> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               akr.a.fieldOf("id").forGetter(dar::b),
               bur.a.fieldOf("attribute").forGetter(dar::c),
               daj.b.fieldOf("amount").forGetter(dar::d),
               buu.a.f.fieldOf("operation").forGetter(dar::e)
            )
            .apply($$0, dar::new)
   );

   private akr a(azk $$0) {
      return this.b.g("/" + $$0.c());
   }

   public buu a(int $$0, azk $$1) {
      return new buu(this.a($$1), (double)this.d().a($$0), this.e());
   }

   @Override
   public void a(aqu $$0, int $$1, dab $$2, bsr $$3, exc $$4, boolean $$5) {
      if ($$5 && $$3 instanceof btn $$6) {
         $$6.eS().a(this.a($$1, $$2.b()));
      }
   }

   @Override
   public void a(dab $$0, bsr $$1, exc $$2, int $$3) {
      if ($$1 instanceof btn $$4) {
         $$4.eS().b(this.a($$3, $$0.b()));
      }
   }

   private HashMultimap<jm<bur>, buu> a(int $$0, bsy $$1) {
      HashMultimap<jm<bur>, buu> $$2 = HashMultimap.create();
      $$2.put(this.d, this.a($$0, (azk)$$1));
      return $$2;
   }

   @Override
   public MapCodec<dar> a() {
      return a;
   }

   public jm<bur> c() {
      return this.d;
   }

   public daj d() {
      return this.e;
   }

   public buu.a e() {
      return this.f;
   }
}
