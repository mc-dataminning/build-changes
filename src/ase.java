import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import javax.annotation.Nullable;

public class ase implements asa {
   private final asc a;
   private final Long2ObjectOpenHashMap<edr> b = new Long2ObjectOpenHashMap();
   private dir c = new dir(0, 0);
   private final int d;
   private final int e;
   private final int f;
   private boolean g;

   private ase(asc $$0, int $$1, int $$2, int $$3) {
      this.a = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static ase b(int $$0) {
      return $$0 > 0 ? c($$0 + 1) : c();
   }

   public static ase c(int $$0) {
      asc $$1 = asc.c($$0);
      int $$2 = asa.a($$0);
      int $$3 = $$0 + aqt.a;
      int $$4 = asa.a($$3);
      return new ase($$1, $$2, $$3, $$4);
   }

   public static ase c() {
      return new ase(asc.c(), 0, 0, 0);
   }

   @Override
   public void a(dir $$0) {
      if (this.g) {
         this.a.a($$0);
         this.c = $$0;
      }
   }

   @Override
   public void a(dir $$0, @Nullable edr $$1) {
      if (this.g) {
         this.a.a($$0, $$1);
         if ($$1 == null) {
            this.b.remove($$0.a());
         } else {
            this.b.put($$0.a(), $$1);
         }
      }
   }

   @Override
   public void a() {
      this.g = true;
      this.b.clear();
      this.a.a();
   }

   @Override
   public void b() {
      this.g = false;
      this.a.b();
   }

   public int d() {
      return this.d;
   }

   public int e() {
      return this.f;
   }

   public int f() {
      return this.a.d();
   }

   @Nullable
   public edr a(int $$0, int $$1) {
      return (edr)this.b.get(dir.c($$0 + this.c.h - this.e, $$1 + this.c.i - this.e));
   }
}
