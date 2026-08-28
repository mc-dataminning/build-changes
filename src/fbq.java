import com.google.common.collect.Lists;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class fbq extends fck implements fce {
   @SerializedName("pingResults")
   public List<fcf> a = Lists.newArrayList();
   @SerializedName("worldIds")
   public List<Long> b = Lists.newArrayList();
}
