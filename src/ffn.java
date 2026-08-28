import com.google.gson.JsonObject;
import java.util.Objects;
import javax.annotation.Nullable;

public class ffn extends ffv {
   public final boolean a;
   public final boolean b;
   public final int c;
   public final boolean d;
   public final boolean e;
   public final int f;
   public final int g;
   private final String m;
   public final String h;
   public final ffi.a i;
   public long j;
   @Nullable
   public String k;
   public boolean l;
   private static final boolean n = false;
   private static final boolean o = true;
   private static final boolean p = true;
   private static final int q = 0;
   private static final boolean r = false;
   private static final int s = 2;
   private static final int t = 0;
   private static final String u = "";
   private static final String v = "";
   private static final ffi.a w = ffi.a.a;
   private static final long x = -1L;
   private static final String y = null;

   public ffn(boolean $$0, boolean $$1, int $$2, boolean $$3, int $$4, int $$5, boolean $$6, String $$7, String $$8, ffi.a $$9) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
      this.f = $$4;
      this.g = $$5;
      this.e = $$6;
      this.m = $$7;
      this.h = $$8;
      this.i = $$9;
   }

   public static ffn a() {
      return new ffn(true, true, 0, false, 2, 0, false, "", "", w);
   }

   public static ffn b() {
      ffn $$0 = a();
      $$0.a(true);
      return $$0;
   }

   public void a(boolean $$0) {
      this.l = $$0;
   }

   public static ffn a(JsonObject $$0) {
      ffn $$1 = new ffn(
         fhs.a("pvp", $$0, true),
         fhs.a("spawnMonsters", $$0, true),
         fhs.a("spawnProtection", $$0, 0),
         fhs.a("commandBlocks", $$0, false),
         fhs.a("difficulty", $$0, 2),
         fhs.a("gameMode", $$0, 0),
         fhs.a("forceGameMode", $$0, false),
         fhs.a("slotName", $$0, ""),
         fhs.a("version", $$0, ""),
         ffi.d(fhs.a("compatibility", $$0, ffi.a.a.name()))
      );
      $$1.j = fhs.a("worldTemplateId", $$0, -1L);
      $$1.k = fhs.b("worldTemplateImage", $$0, y);
      return $$1;
   }

   public String a(int $$0) {
      if (bah.h(this.m)) {
         return this.l ? gzk.a("mco.configure.world.slot.empty") : this.b($$0);
      } else {
         return this.m;
      }
   }

   public String b(int $$0) {
      return gzk.a("mco.configure.world.slot", $$0);
   }

   public String c() {
      JsonObject $$0 = new JsonObject();
      if (!this.a) {
         $$0.addProperty("pvp", this.a);
      }

      if (!this.b) {
         $$0.addProperty("spawnMonsters", this.b);
      }

      if (this.c != 0) {
         $$0.addProperty("spawnProtection", this.c);
      }

      if (this.d) {
         $$0.addProperty("commandBlocks", this.d);
      }

      if (this.f != 2) {
         $$0.addProperty("difficulty", this.f);
      }

      if (this.g != 0) {
         $$0.addProperty("gameMode", this.g);
      }

      if (this.e) {
         $$0.addProperty("forceGameMode", this.e);
      }

      if (!Objects.equals(this.m, "")) {
         $$0.addProperty("slotName", this.m);
      }

      if (!Objects.equals(this.h, "")) {
         $$0.addProperty("version", this.h);
      }

      if (this.i != w) {
         $$0.addProperty("compatibility", this.i.name());
      }

      return $$0.toString();
   }

   public ffn d() {
      return new ffn(this.a, this.b, this.c, this.d, this.f, this.g, this.e, this.m, this.h, this.i);
   }
}
