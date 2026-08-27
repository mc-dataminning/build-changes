import com.google.gson.annotations.SerializedName;

public class ene extends enl implements enf {
   @SerializedName("seed")
   private final String a;
   @SerializedName("worldTemplateId")
   private final long b;
   @SerializedName("levelType")
   private final int c;
   @SerializedName("generateStructures")
   private final boolean d;

   public ene(String $$0, long $$1, int $$2, boolean $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }
}
