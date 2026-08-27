import com.google.gson.JsonObject;
import java.util.Objects;
import javax.annotation.Nullable;

public class enf extends enn {
   public final boolean a;
   public final boolean b;
   public final boolean c;
   public final boolean d;
   public final int e;
   public final boolean f;
   public final boolean g;
   public final int h;
   public final int i;
   @Nullable
   private final String m;
   public long j;
   @Nullable
   public String k;
   public boolean l;
   private static final boolean n = false;
   private static final boolean o = true;
   private static final boolean p = true;
   private static final boolean q = true;
   private static final boolean r = true;
   private static final int s = 0;
   private static final boolean t = false;
   private static final int u = 2;
   private static final int v = 0;
   private static final String w = "";
   private static final long x = -1L;
   private static final String y = null;

   public enf(boolean $$0, boolean $$1, boolean $$2, boolean $$3, int $$4, boolean $$5, int $$6, int $$7, boolean $$8, @Nullable String $$9) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.e = $$4;
      this.f = $$5;
      this.h = $$6;
      this.i = $$7;
      this.g = $$8;
      this.m = $$9;
   }

   public static enf a() {
      return new enf(true, true, true, true, 0, false, 2, 0, false, "");
   }

   public static enf b() {
      enf $$0 = a();
      $$0.a(true);
      return $$0;
   }

   public void a(boolean $$0) {
      this.l = $$0;
   }

   public static enf a(JsonObject $$0) {
      enf $$1 = new enf(
         epk.a("pvp", $$0, true),
         epk.a("spawnAnimals", $$0, true),
         epk.a("spawnMonsters", $$0, true),
         epk.a("spawnNPCs", $$0, true),
         epk.a("spawnProtection", $$0, 0),
         epk.a("commandBlocks", $$0, false),
         epk.a("difficulty", $$0, 2),
         epk.a("gameMode", $$0, 0),
         epk.a("forceGameMode", $$0, false),
         epk.a("slotName", $$0, "")
      );
      $$1.j = epk.a("worldTemplateId", $$0, -1L);
      $$1.k = epk.a("worldTemplateImage", $$0, y);
      return $$1;
   }

   public String a(int $$0) {
      if (this.m != null && !this.m.isEmpty()) {
         return this.m;
      } else {
         return this.l ? gam.a("mco.configure.world.slot.empty") : this.b($$0);
      }
   }

   public String b(int $$0) {
      return gam.a("mco.configure.world.slot", $$0);
   }

   public String c() {
      JsonObject $$0 = new JsonObject();
      if (!this.a) {
         $$0.addProperty("pvp", this.a);
      }

      if (!this.b) {
         $$0.addProperty("spawnAnimals", this.b);
      }

      if (!this.c) {
         $$0.addProperty("spawnMonsters", this.c);
      }

      if (!this.d) {
         $$0.addProperty("spawnNPCs", this.d);
      }

      if (this.e != 0) {
         $$0.addProperty("spawnProtection", this.e);
      }

      if (this.f) {
         $$0.addProperty("commandBlocks", this.f);
      }

      if (this.h != 2) {
         $$0.addProperty("difficulty", this.h);
      }

      if (this.i != 0) {
         $$0.addProperty("gameMode", this.i);
      }

      if (this.g) {
         $$0.addProperty("forceGameMode", this.g);
      }

      if (!Objects.equals(this.m, "")) {
         $$0.addProperty("slotName", this.m);
      }

      return $$0.toString();
   }

   public enf d() {
      return new enf(this.a, this.b, this.c, this.d, this.e, this.f, this.h, this.i, this.g, this.m);
   }
}
